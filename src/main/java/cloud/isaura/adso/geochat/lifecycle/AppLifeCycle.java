package cloud.isaura.adso.geochat.lifecycle;


import cloud.isaura.adso.geochat.data.init.MongoIngestor;
import cloud.isaura.adso.geochat.data.init.MongoInitializer;
import cloud.isaura.adso.geochat.lifecycle.init.repository.bologna.WifiBolognaFileRepository;
import com.mongodb.client.MongoClient;
import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import org.jboss.logging.Logger;


@ApplicationScoped
public class AppLifeCycle
{
    private static final Logger LOGGER = Logger.getLogger("AppLifeCycle");

    @Inject
    MongoInitializer mongoInitializer;

    @Inject
    private MongoIngestor mongoIngestor;

    @Inject
    private WifiBolognaFileRepository wifiBolognaFileRepository;

    void onStart(@Observes StartupEvent ev) throws Exception {
        LOGGER.info("The application is starting...");
        MongoClient mongoClient = mongoInitializer.setUpMongo();
        mongoIngestor.ingest(mongoClient, this.wifiBolognaFileRepository.documentList(),"geochat","wifi");

    }

    void onStop(@Observes ShutdownEvent ev) {
        LOGGER.info("The application is stopping...");
    }


}
