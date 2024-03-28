package cloud.isaura.adso.geochat.data.rest.responses;

public class Properties
{
    private String codice_zona;
    private String nome_zona;
    private double affluenza_media;

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

    public double getAffluenza_media() {
        return affluenza_media;
    }

    public void setAffluenza_media(double affluenza_media) {
        this.affluenza_media = affluenza_media;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "codice_zona='" + codice_zona + '\'' +
                ", nome_zona='" + nome_zona + '\'' +
                ", affluenza_media=" + affluenza_media +
                '}';
    }
}
