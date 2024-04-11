package cloud.isaura.adso.geochat.data.repository;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MongoRepository implements PanacheMongoRepository<TurnoutEntity>
{

}
