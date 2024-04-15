package cloud.isaura.adso.geochat.conversation.prompt;

import java.util.ArrayList;
import java.util.List;

public class GeoPrompt
{
    private String system;

    private String memory;

    private String user;

    private String response;

    private List<CodedItem> tools;

    private List<CodedItem> helpers;

    public GeoPrompt()
    {
        this.helpers = new ArrayList<>();
        this.tools = new ArrayList<>();
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user=user;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public List<CodedItem> getTools() {
        return tools;
    }

    public void setTools(List<CodedItem> tools) {
        this.tools = tools;
    }

    public List<CodedItem> getHelpers() {
        return helpers;
    }

    public void setHelpers(List<CodedItem> helpers) {
        this.helpers = helpers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("SYSTEM");
        sb.append(this.system);
        sb.append("\n");
        sb.append("MEMORY");
        sb.append(this.memory);
        sb.append("\n");
        sb.append("TOOLS");
        sb.append("\n");
        this.getTools().stream().forEach(codedItem -> sb.append(codedItem.toString()+"\n"));
        sb.append("\n");
        sb.append("HELPERS");
        sb.append("\n");
        this.getHelpers().stream().forEach(codedItem -> sb.append(codedItem.toString()+"\n"));
        sb.append("\n");
        sb.append("USER");
        sb.append(this.user);
        sb.append("\n");
        sb.append("RESPONSE");
        sb.append(this.response);
        return sb.toString();
    }
}
