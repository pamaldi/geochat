package cloud.isaura.adso.geochat.data.init;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import jakarta.enterprise.context.ApplicationScoped;
import org.bson.Document;
import org.jboss.logging.Logger;

import java.util.List;


@ApplicationScoped
public class MongoIngestor
{

    private static final Logger LOGGER = Logger.getLogger("MongoIngestor");


    public void  ingest(MongoClient mongoClient, List<Document> documents, String databaseName, String collectionName) throws Exception {
                LOGGER.info("Start connecting to mongo");
                LOGGER.info("Start Ingesting data for collection "+collectionName);
                long numberOfDocuments = mongoClient.getDatabase(databaseName).getCollection(collectionName).countDocuments();
                if(numberOfDocuments > 0)
                {
                    return;
                }
                documents.forEach(document -> {

                    mongoClient.getDatabase(databaseName).getCollection(collectionName).insertOne(document);
                });
                LOGGER.info("End Ingesting data");
                MongoCollection<Document> collection = mongoClient.getDatabase(databaseName).getCollection(collectionName);
                LOGGER.info("Ingested data "+collection.countDocuments());
                for (Document doc : collection.find()) {
                    System.out.println(doc.toJson());
                }
                LOGGER.info("End Ingesting data");
    }



}
