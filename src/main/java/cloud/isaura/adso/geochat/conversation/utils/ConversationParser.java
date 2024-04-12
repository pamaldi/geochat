package cloud.isaura.adso.geochat.conversation.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ConversationParser
{
    public static String fromRequest(String jsonString) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(jsonString);
        return jsonNode.get("text").asText();
    }

    public static String toResponse(String string) throws JsonProcessingException
    {
        ObjectMapper objectMapper = new ObjectMapper();
        // Creating a JSON object node
        ObjectNode jsonObject = objectMapper.createObjectNode();
        // Adding the input string to the JSON object
        jsonObject.put("text", string);

        // Convert the JSON object to a string
        return objectMapper.writeValueAsString(jsonObject);
    }

}
