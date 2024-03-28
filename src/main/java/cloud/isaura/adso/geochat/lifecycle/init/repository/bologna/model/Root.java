package cloud.isaura.adso.geochat.lifecycle.init.repository.bologna.model;



import java.util.List;

public final class Root

{
    private String type;

    private List<Feature> features;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }
}
