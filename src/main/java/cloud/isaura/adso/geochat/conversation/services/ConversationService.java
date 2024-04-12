package cloud.isaura.adso.geochat.conversation.services;

import cloud.isaura.adso.geochat.conversation.agents.GeoAgent;
import cloud.isaura.adso.geochat.conversation.utils.ConversationParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.jboss.logging.Logger;

@ApplicationScoped
public class ConversationService
{
    private static final Logger LOGGER = Logger.getLogger("ConversationAgent");

    @Inject
    GeoAgent geoAgent;

    public String answer(String request) throws JsonProcessingException
    {
        String parsed = ConversationParser.fromRequest(request);
        LOGGER.info("parsed request "+parsed);
        String response = this.geoAgent.response(parsed);
        LOGGER.info("Response "+response);
        return ConversationParser.toResponse(response);
    }

}
