package cloud.isaura.adso.geochat.conversation;

import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.enterprise.context.ApplicationScoped;
import org.jboss.logging.Logger;

@ApplicationScoped
public class ConversationService
{


    private static final Logger LOGGER = Logger.getLogger("ConversationAgent");





    public String answer(String request) throws JsonProcessingException
    {
        String parsed = ConversationParser.fromRequest(request);
        LOGGER.info("parsed request "+parsed);
        String response = parsed;
        LOGGER.info("Response "+response);
        return ConversationParser.toResponse(response);
    }

}
