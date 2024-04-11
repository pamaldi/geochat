package cloud.isaura.adso.geochat.conversation;

import com.fasterxml.jackson.core.JsonProcessingException;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.openai.OpenAiChatModelName;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import org.jboss.logging.Logger;

@ApplicationScoped
public class ConversationAgent
{
    private ChatLanguageModel model;

    private static final Logger LOGGER = Logger.getLogger("ConversationAgent");

    void startup(@Observes StartupEvent ev)
    {
        OpenAiChatModel.OpenAiChatModelBuilder openAiChatModelBuilder = new OpenAiChatModel.OpenAiChatModelBuilder();
        openAiChatModelBuilder.modelName(OpenAiChatModelName.GPT_4);
        openAiChatModelBuilder.apiKey(ApiKeys.OPEN_AI_API_KEY);
        model = openAiChatModelBuilder.build();
        LOGGER.info("Startup performed ");
    }

    public String answer(String request) throws JsonProcessingException {
        String parsed = ConversationParser.fromRequest(request);
        LOGGER.info("parsed request "+parsed);
        String response = parsed;
        LOGGER.info("Response "+response);
        return ConversationParser.toResponse(response);
    }

}
