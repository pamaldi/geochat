package cloud.isaura.adso.geochat.data.repository;

import cloud.isaura.adso.geochat.lifecycle.init.repository.bologna.model.Geometry;
import cloud.isaura.adso.geochat.lifecycle.init.repository.bologna.model.Properties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(collection="wifi")
public class TurnoutEntity
{
    private String _id;

    private Geometry geometry;

    private String type="Feature";

    private Properties properties;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        ObjectMapper om = new ObjectMapper();
        try {
            String jsonString = om.writeValueAsString(this);
            return jsonString;
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
