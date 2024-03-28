package cloud.isaura.adso.geochat.lifecycle.init.repository.bologna.model;

public class Properties
{
    private String codice_zona;
    private String nome_zona;
    private String data;
    private int ora;
    private int affluenza_media;
    private String giorno;
    private GeoPoint2d geo_point_2d;

    public String getCodice_zona() {
        return codice_zona;
    }

    public void setCodice_zona(String codice_zona) {
        this.codice_zona = codice_zona;
    }

    public String getNome_zona() {
        return nome_zona;
    }

    public void setNome_zona(String nome_zona) {
        this.nome_zona = nome_zona;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getOra() {
        return ora;
    }

    public void setOra(int ora) {
        this.ora = ora;
    }

    public int getAffluenza_media() {
        return affluenza_media;
    }

    public void setAffluenza_media(int affluenza_media) {
        this.affluenza_media = affluenza_media;
    }

    public String getGiorno() {
        return giorno;
    }

    public void setGiorno(String giorno) {
        this.giorno = giorno;
    }

    public GeoPoint2d getGeo_point_2d() {
        return geo_point_2d;
    }

    public void setGeo_point_2d(GeoPoint2d geo_point_2d) {
        this.geo_point_2d = geo_point_2d;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "codice_zona='" + codice_zona + '\'' +
                ", nome_zona='" + nome_zona + '\'' +
                ", data='" + data + '\'' +
                ", ora=" + ora +
                ", affluenza_media=" + affluenza_media +
                ", giorno='" + giorno + '\'' +
                ", geo_point_2d=" + geo_point_2d +
                '}';
    }
}
