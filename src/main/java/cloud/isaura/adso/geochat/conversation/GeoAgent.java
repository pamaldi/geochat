package cloud.isaura.adso.geochat.conversation;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.openai.OpenAiChatModelName;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import org.jboss.logging.Logger;

@ApplicationScoped
public class GeoAgent
{
    private ChatLanguageModel model;

    private static final Logger LOGGER = Logger.getLogger("GeoAgent");

    void startup(@Observes StartupEvent ev)
    {
        OpenAiChatModel.OpenAiChatModelBuilder openAiChatModelBuilder = new OpenAiChatModel.OpenAiChatModelBuilder();
        openAiChatModelBuilder.modelName(OpenAiChatModelName.GPT_4);
        openAiChatModelBuilder.apiKey(ApiKeys.OPEN_AI_API_KEY);
        model = openAiChatModelBuilder.build();
        LOGGER.info("Startup performed ");
    }

    GeoAgentResponse xxx()
    {
        return null;
    }
}
