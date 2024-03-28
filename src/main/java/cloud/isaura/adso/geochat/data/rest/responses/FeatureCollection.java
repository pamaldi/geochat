package cloud.isaura.adso.geochat.data.rest.responses;

import java.util.List;

public class FeatureCollection
{
    List<Feature> features;

    String type;

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "FeatureCollection{" +
                "features=" + features +
                ", type='" + type + '\'' +
                '}';
    }
}
