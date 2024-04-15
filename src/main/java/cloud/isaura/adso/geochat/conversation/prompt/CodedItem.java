package cloud.isaura.adso.geochat.conversation.prompt;

public record CodedItem(String code, String description)
{
    @Override
    public String toString() {
       return  "-"+code+":"+description;
    }
}
