

var map = L.map('myMap').setView([44.4949, 11.3426], 12);

L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
    attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
}).addTo(map);

var heatPoints;
var heatmap;
var mapResponseDetail;

fetch('http://localhost:8080/map?startDate=2024-01-01&endDate=2024-04-11')
    .then(function(response) {
        return response.json();
    })
    .then(function(geojsonData) {
        geojsonData.featureCollection.features.forEach(feature => {
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
        heatPoints = geojsonData.featureCollection.features.map(function(feature) {
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
        info.update(geojsonData.mapResponseDetail);
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

// Adding a custom control for displaying static information
var info = L.control({position: 'topright'});

info.onAdd = function (map) {
    this._div = L.DomUtil.create('div', 'info');
    this._div.innerHTML = 'Loading data...';
    return this._div;
};

// Method to update the control based on the data passed
info.update = function (data) {
    var propertiesHtml = data.mapResponseProperties.map(function(prop) {
        return `<strong>${prop.nomeZona}</strong><br>Affluenza: ${prop.affluenza}<br>Codice Zona: ${prop.codiceZona}<br><br>`;
    }).join('');

    this._div.innerHTML = `<h4>Map Information</h4>
                           Start Date: ${data.startDate}<br>
                           End Date: ${data.endDate}<br>
                           ${propertiesHtml}`;
};

info.addTo(map);

// Style the info control in your CSS if needed, e.g.,
 //.info { background: rgba(255, 255, 255, 0.8); margin: 10px; padding: 10px; border-radius: 4px; }





