package cloud.isaura.adso.geochat.conversation.agents;

import cloud.isaura.adso.geochat.conversation.conf.ApiKeys;
import cloud.isaura.adso.geochat.conversation.prompt.GeoPrompt;
import cloud.isaura.adso.geochat.conversation.prompt.PromptParser;
import cloud.isaura.adso.geochat.conversation.prompt.PromptUtils;
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
    private GeoPrompt geoPrompt;

    private static final Logger LOGGER = Logger.getLogger("GeoAgent");

    void startup(@Observes StartupEvent ev)
    {
        OpenAiChatModel.OpenAiChatModelBuilder openAiChatModelBuilder = new OpenAiChatModel.OpenAiChatModelBuilder();
        openAiChatModelBuilder.modelName(OpenAiChatModelName.GPT_4);
        openAiChatModelBuilder.apiKey(ApiKeys.OPEN_AI_API_KEY);
        model = openAiChatModelBuilder.build();
        PromptParser promptParser = new PromptParser();
        geoPrompt = promptParser.build(PromptUtils.PROMPT);
        LOGGER.info("Startup performed ");
        LOGGER.info(" geoPrompt "+geoPrompt);
    }

    public String response(String request)
    {
        LOGGER.info("Request "+request);
        this.geoPrompt.setUser(request);
        String question = this.geoPrompt.toString();
        LOGGER.info("Question "+question);
        String answer = model.generate(question);
        LOGGER.info("Response "+answer);
        return answer;
    }
}
