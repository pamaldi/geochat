
var map = L.map('myMap').setView([44.4949, 11.3426], 12);

L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
    attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
}).addTo(map);

var heatPoints;
var heatmap;
/*
function onEachFeature(feature, layer) {
    let popupContent = `<p></p>`;

    if (feature.properties && feature.properties.affluenza_media) {
        popupContent += feature.properties.affluenza_media;
    }

    layer.bindPopup(popupContent);
}

// Use the fetch API to load the JSON data from the endpoint
async function fetchDataAndAddToMap() {
    try {
        const response = await fetch('http://localhost:8080/map');
        if (!response.ok) {
            throw new Error('Network response was not ok');
        }
        const data = await response.json(); // Wait for the response to be parsed as JSON

        // Clear existing data on the map
        map.eachLayer(function(layer) {
            if (!!layer.toGeoJSON) { // Check if layer is a GeoJSON layer
                map.removeLayer(layer);
            }
        });

        // Add new data to the map
        L.geoJSON(data,{
            onEachFeature
        }).addTo(map);
    } catch (error) {
        console.error('There has been a problem with your fetch operation:', error);
    }
}

// Initial fetch of the data
fetchDataAndAddToMap();
*/



fetch('http://localhost:8080/map')
    .then(function(response) {
        return response.json();
    })
    .then(function(geojsonData) {
        geojsonData.features.forEach(feature => {
            if (feature.geometry.type === 'Polygon') {
                ensureRightHandRule(feature.geometry);
            } else if (feature.geometry.type === 'MultiPolygon') {
                // For MultiPolygon, iterate through each polygon and apply ensureRightHandRule
                feature.geometry.coordinates.forEach(polygon => {
                    ensureRightHandRule({ type: 'Polygon', coordinates: polygon });
                });
            }
        });
        // Assuming geojsonData is the GeoJSON object fetched from the server
        heatPoints = geojsonData.features.map(function(feature) {
            if (feature.geometry.type === "Polygon") {
                var allCoords = feature.geometry.coordinates[0]; // Assuming the first array is the outer boundary
                var latSum = 0, lonSum = 0;
                allCoords.forEach(function(coord) {
                    lonSum += coord[0];
                    latSum += coord[1];
                });
                var centroidLat = latSum / allCoords.length;
                var centroidLon = lonSum / allCoords.length;
                return [
                    centroidLat,
                    centroidLon,
                    feature.properties.affluenza_media || 1
                ];
            }
            // Add else if for other geometry types if necessary
        });

        // Create the heatmap
        heatmap = L.heatLayer(heatPoints, {
            radius: 25, // Adjust for appearance
            blur: 15, // Adjust for appearance
            maxZoom: 11,
            gradient: { '0.00': 'rgb(255,0,255)',
                '0.25': 'rgb(0,0,255)',
                '0.50': 'rgb(0,255,0)',
                '0.75': 'rgb(255,255,0)',
                '1.00': 'rgb(255,0,0)'}
        }).addTo(map);
        heatmap.on('click', function(e) {
            // create a popup with the intensity value
            var popup = L.popup()
                .setLatLng(e.latlng)
                .setContent('Intensity: ' + e.intensity)
                .openOn(map);
        });
    })
    .catch(function(error) {
        console.error('Error fetching GeoJSON:', error);
    });

function ensureRightHandRule(geometry) {
    // This is a simplified check that assumes a single polygon without holes.
    // For a complete solution, you would also need to check and possibly reverse inner rings (holes).

    if (!geometry || geometry.type !== 'Polygon') {
        console.error('Unsupported geometry type or geometry is undefined');
        return;
    }

    // Assuming the polygon is a simple polygon (one ring, no holes)
    const ring = geometry.coordinates[0];

    if (!isClockwise(ring)) {
        // If the outer ring is not clockwise, reverse it to make it comply with the right-hand rule.
        geometry.coordinates[0] = ring.reverse();
    }

    // If there were inner rings (holes), you would ensure they are clockwise (the opposite of the outer ring).
}

function isClockwise(ring) {
    // Calculate the ring's area using the Shoelace formula.
    // A positive area indicates clockwise, while a negative indicates counterclockwise.
    let area = 0;
    for (let i = 0; i < ring.length - 1; i++) {
        area += (ring[i + 1][0] - ring[i][0]) * (ring[i + 1][1] + ring[i][1]);
    }
    return area > 0;
}




