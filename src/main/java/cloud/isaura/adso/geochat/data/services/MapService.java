package cloud.isaura.adso.geochat.data.services;

import cloud.isaura.adso.geochat.data.repository.MongoRepository;
import cloud.isaura.adso.geochat.data.repository.TurnoutEntity;
import cloud.isaura.adso.geochat.data.rest.responses.*;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.jboss.logging.Logger;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ApplicationScoped
public class MapService
{
    @Inject
    MongoRepository mongoRepository;
    private static final Logger LOGGER = Logger.getLogger("MapService");

    public MapResponse data(LocalDate startDate, LocalDate endDate)
    {
        List<TurnoutEntity> turnoutEntities = mongoRepository.listAll();
        List<MapResponseProperties> mapResponsePropertiesList = new ArrayList<>();
        Map<String, List<TurnoutEntity>> groupedByZona = turnoutEntities.stream().collect(Collectors.groupingBy(turnoutEntity -> turnoutEntity.getProperties().getCodice_zona()));
        FeatureCollection featureCollection = new FeatureCollection();
        featureCollection.setType("FeatureCollection");
        List<Feature> features = new ArrayList<>();
        List<Integer> intensities = new ArrayList<>();
        for (Map.Entry<String, List<TurnoutEntity>> entry : groupedByZona.entrySet()) {
            int sum = entry.getValue().stream().map(turnoutEntity -> turnoutEntity.getProperties().getAffluenza_media()).reduce(0, Integer::sum);
            intensities.add(sum);
        }
        double min = intensities.stream().reduce(Integer::min).get();
        double max = intensities.stream().reduce(Integer::max).get();

        for (Map.Entry<String, List<TurnoutEntity>> entry : groupedByZona.entrySet()) {
            double affluenzaTotale = entry.getValue().stream().map(turnoutEntity -> turnoutEntity.getProperties().getAffluenza_media()).reduce(0, Integer::sum);
            TurnoutEntity turnoutEntity = entry.getValue().get(0);
            Feature feature = new Feature();
            Geometry geometry = new Geometry();
            geometry.setCoordinates(turnoutEntity.getGeometry().getCoordinates());
            geometry.setType(turnoutEntity.getGeometry().getType());
            feature.setGeometry(geometry);
            feature.setType("Feature");
            Properties properties = new Properties();
            double affluenzaTotaleNormalizzata = (affluenzaTotale - min)/(max-min);
            properties.setAffluenza_media(affluenzaTotaleNormalizzata);
            properties.setCodice_zona(turnoutEntity.getProperties().getCodice_zona());
            properties.setNome_zona(turnoutEntity.getProperties().getNome_zona());
            feature.setProperties(properties);
            features.add(feature);
            LOGGER.debug("feature "+feature);
            MapResponseProperties mapResponseProperties = new MapResponseProperties(turnoutEntity.getProperties().getNome_zona(),turnoutEntity.getProperties().getCodice_zona(),affluenzaTotale);
            mapResponsePropertiesList.add(mapResponseProperties);
        }

        featureCollection.setFeatures(features);
        MapResponseDetail mapResponseDetail = new MapResponseDetail(startDate,endDate,mapResponsePropertiesList);
        MapResponse mapResponse = new MapResponse(mapResponseDetail,featureCollection);
        return mapResponse;
    }
}
