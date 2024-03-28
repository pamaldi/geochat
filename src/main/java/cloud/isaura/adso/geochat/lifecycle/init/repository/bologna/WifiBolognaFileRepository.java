package cloud.isaura.adso.geochat.lifecycle.init.repository.bologna;


import cloud.isaura.adso.geochat.lifecycle.init.repository.bologna.model.Root;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.bson.Document;
import org.jboss.logging.Logger;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class WifiBolognaFileRepository
{
    private static final Logger LOGGER = Logger.getLogger("BolognaRepo");
    @Inject
    WifiDataResource wifiDataResource;


    public Root load() throws Exception {
        Path path = Path.of(getClass().getClassLoader().getResource("iperbole-wifi-affluenza.geojson").toURI());
        String geoJsonString = new String(Files.readAllBytes(path));
      //LOGGER.info(wifi);
        ObjectMapper om = new ObjectMapper();
        Root root = om.readValue(geoJsonString, Root.class);
        LOGGER.info("wifi "+root);

      return root;
    }

    public List<Document> documentList() throws Exception {
        return load().getFeatures().stream().map(feature -> new Document("geometry", feature.getGeometry()).append("properties", feature.getProperties())).collect(Collectors.toList());

    }


}
