package cloud.isaura.adso.geochat.conversation.prompt;

import jakarta.enterprise.context.ApplicationScoped;
import org.jboss.logging.Logger;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class PromptParser
{
    private static final Logger LOGGER = Logger.getLogger("PromptParser");

    public GeoPrompt build(String prompt)
    {
        GeoPrompt geoPrompt = new GeoPrompt();
        geoPrompt.setSystem(extract(prompt, "SYSTEM", "MEMORY"));
        geoPrompt.setMemory(extract(prompt,"MEMORY","TOOLS"));
        geoPrompt.setUser(extract(prompt,"USER","RESPONSE"));
        geoPrompt.setResponse(extract(prompt,"RESPONSE","END"));
        geoPrompt.setHelpers(getCodedItems("HELPERS","USER",prompt));
        geoPrompt.setTools(getCodedItems("TOOLS","HELPERS",prompt));
        return geoPrompt;
    }

    private String extract(String string, String start, String end) {
        int toSearchLength = start.length();
        int startIndex = string.indexOf(start)+toSearchLength;
        int endIndex = string.indexOf(end,startIndex);
        return string.substring(startIndex, endIndex);
    }

    private List<CodedItem> getCodedItems(String start, String end, String prompt)
    {
        List<CodedItem> codedItems = new ArrayList<>();
        String portion = extract(prompt,start,end);
        int fromIndex = 0;
        String startDelimiter = "-";
        while((portion.indexOf(startDelimiter, fromIndex)>=0)) {
           int currentStart = portion.indexOf(startDelimiter, fromIndex);
           int currentEnd = portion.indexOf("\n",currentStart);
           String item = portion.substring(currentStart,currentEnd);
           String code = extract(item,"-",":").trim();
           String description = item.substring(item.indexOf(":")+1).trim();
           CodedItem codedItem = new CodedItem(code,description);
           codedItems.add(codedItem);
           fromIndex=currentEnd;
        }

        return codedItems;
    }
}
