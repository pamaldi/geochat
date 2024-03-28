package cloud.isaura.adso.geochat.data.rest;

import cloud.isaura.adso.geochat.data.repository.MongoRepository;
import cloud.isaura.adso.geochat.data.repository.TurnoutEntity;
import cloud.isaura.adso.geochat.data.rest.responses.Feature;
import cloud.isaura.adso.geochat.data.rest.responses.FeatureCollection;
import cloud.isaura.adso.geochat.data.rest.responses.Geometry;
import cloud.isaura.adso.geochat.data.rest.responses.Properties;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Path("/map")
public class MapController
{
    @Inject
    MongoRepository mongoRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public FeatureCollection map() {
        long count = mongoRepository.count();
        System.out.println("count "+count);
        List<TurnoutEntity> turnoutEntities = mongoRepository.listAll();
        Map<String, List<TurnoutEntity>> groupedByZona = turnoutEntities.stream().collect(Collectors.groupingBy(turnoutEntity -> turnoutEntity.getProperties().getCodice_zona()));
        FeatureCollection featureCollection = new FeatureCollection();
        featureCollection.setType("FeatureCollection");
        List<Feature> features = new ArrayList<>();
        List<Integer> intensities = new ArrayList<>();
        for (Map.Entry<String, List<TurnoutEntity>> entry : groupedByZona.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().size());
            int sum = entry.getValue().stream().map(turnoutEntity -> turnoutEntity.getProperties().getAffluenza_media()).reduce(0, Integer::sum);
            intensities.add(sum);
        }
        double min = intensities.stream().reduce(Integer::min).get();
        double max = intensities.stream().reduce(Integer::max).get();
        System.out.println("min "+min);
        System.out.println("max "+max);
        System.out.println("Intensities "+intensities);
            for (Map.Entry<String, List<TurnoutEntity>> entry : groupedByZona.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().size());
            double affluenzaTotale = entry.getValue().stream().map(turnoutEntity -> turnoutEntity.getProperties().getAffluenza_media()).reduce(0, Integer::sum);
            System.out.println("affluenzaTotale "+affluenzaTotale);
            TurnoutEntity turnoutEntity = entry.getValue().get(0);
            Feature feature = new Feature();
            Geometry geometry = new Geometry();
            geometry.setCoordinates(turnoutEntity.getGeometry().getCoordinates());
            geometry.setType(turnoutEntity.getGeometry().getType());
            feature.setGeometry(geometry);
            feature.setType("Feature");
            Properties properties = new Properties();
            System.out.println("min "+min+" max "+max+" max -min "+(max-min));
            double affluenzaTotaleNormalizzata = (affluenzaTotale - min)/(max-min);
            properties.setAffluenza_media(affluenzaTotaleNormalizzata);
            System.out.println("norm "+affluenzaTotaleNormalizzata);
            properties.setCodice_zona(turnoutEntity.getProperties().getCodice_zona());
            properties.setNome_zona(turnoutEntity.getProperties().getNome_zona());
            feature.setProperties(properties);
            features.add(feature);
        }
        featureCollection.setFeatures(features);
        return featureCollection;
    }
}
