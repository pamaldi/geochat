package cloud.isaura.adso.geochat.conversation.scratch;

import cloud.isaura.adso.geochat.conversation.conf.ApiKeys;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.openai.OpenAiChatModelName;
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
        OpenAiChatModel.OpenAiChatModelBuilder openAiChatModelBuilder = new OpenAiChatModel.OpenAiChatModelBuilder();
        openAiChatModelBuilder.modelName(OpenAiChatModelName.GPT_4);
        openAiChatModelBuilder.apiKey(ApiKeys.OPEN_AI_API_KEY);
        ChatLanguageModel model = openAiChatModelBuilder.build();
        String question = "SYSTEM\n" +
                "Ti sarà posta una domanda da cui dovrai estrarre delle date, molto probabilmente in un intervallo. La tua risposta deve essere un file json con i campi data_inizio e data_fine. Se nella risposta c'è solo una data, inserisci in data_fine e non valorizzare data_inizio.\n" +
                "La data odierna, oggi, è 28 Marzo 2024, quindi tutte le domande che contengono un riferimento temporale devono partire da questa data.\n" +
                "Con ieri si intende un giorno in meno.\n" +
                "\n" +
                "USER\n" +
                "Mi servirebberoi dati dell'ultima settimana?";
        String answer = model.generate(question);
        System.out.println(question);
        System.out.println(answer);
    }
}
