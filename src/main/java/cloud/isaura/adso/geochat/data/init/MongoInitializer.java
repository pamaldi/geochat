package cloud.isaura.adso.geochat.data.init;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import de.flapdoodle.embed.mongo.config.Net;
import de.flapdoodle.embed.mongo.distribution.Version;
import de.flapdoodle.embed.mongo.transitions.Mongod;
import de.flapdoodle.embed.mongo.transitions.RunningMongodProcess;
import de.flapdoodle.reverse.TransitionWalker;
import de.flapdoodle.reverse.transitions.Start;
import jakarta.enterprise.context.ApplicationScoped;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;

import java.util.Collections;

@ApplicationScoped
public class MongoInitializer
{

    @ConfigProperty(name = "mongo.port")
    int port;

    private static final Logger LOGGER = Logger.getLogger("MongoInitializer");


    public MongoClient setUpMongo()
    {
        Mongod mongod = Mongod.builder()
                .net(Start.to(Net.class).initializedWith(Net.defaults()
                        .withPort(port)))
                .build();
        MongoClientSettings settings = null;
        TransitionWalker.ReachedState<RunningMongodProcess> running = mongod.start(Version.Main.PRODUCTION);
            com.mongodb.ServerAddress serverAddress = new com.mongodb.ServerAddress(running.current().getServerAddress().getHost(), running.current().getServerAddress().getPort());
            LOGGER.info("MongoDB started on " + serverAddress.getHost() + ":" + serverAddress.getPort());
            PojoCodecProvider codecProvider = PojoCodecProvider.builder()
                    .automatic(true)
                    .build();
       settings = MongoClientSettings.builder()
                    .applyToClusterSettings(builder ->
                            builder.hosts(Collections.singletonList(serverAddress)))
                    .codecRegistry(CodecRegistries.fromRegistries(CodecRegistries.fromRegistries(
                            MongoClientSettings.getDefaultCodecRegistry(),
                            CodecRegistries.fromProviders(codecProvider)
                    )))
                    .build();
         MongoClient mongoClient = MongoClients.create(settings);
         checkMongoInstance(mongoClient);
         return mongoClient;
    }

    private static void checkMongoInstance(MongoClient mongo) {
        mongo.getDatabase("testdb").getCollection("testcoll").insertOne(new Document("key", "value"));
        long count = mongo.getDatabase("testdb").getCollection("testcoll").countDocuments();
        LOGGER.info("Check Mongo Instance - Count inserted: " + count);
    }


}
