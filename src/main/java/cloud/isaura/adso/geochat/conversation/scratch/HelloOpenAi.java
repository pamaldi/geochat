package cloud.isaura.adso.geochat.conversation.scratch;

import cloud.isaura.adso.geochat.conversation.ApiKeys;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import org.jboss.logging.Logger;

import java.util.Map;

public class HelloOpenAi
{
    private static final Logger LOGGER = Logger.getLogger("HelloOpenAi");

    public static void main(String[] args)
    {
        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n", envName, env.get(envName));
        }
        ChatLanguageModel model = OpenAiChatModel.withApiKey(ApiKeys.OPEN_AI_API_KEY);
        String question = "Ma nove per nove farà ottantuno";
        String answer = model.generate(question);
        System.out.println(question);
        System.out.println(answer);
    }
}
