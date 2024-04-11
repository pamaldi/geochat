package cloud.isaura.adso.geochat.conversation.ws;
import cloud.isaura.adso.geochat.conversation.ConversationService;
import jakarta.inject.Inject;
import jakarta.websocket.OnClose;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;
import org.eclipse.microprofile.context.ManagedExecutor;
import org.jboss.logging.Logger;


@ServerEndpoint("/chatbot")
public class WebSocketEndpoint
{

    private static final Logger LOGGER = Logger.getLogger("WebSocket");
    @Inject
    ManagedExecutor managedExecutor;

    @Inject
    ConversationService conversationService;

    @OnOpen
    public void onOpen(Session session) {
        LOGGER.info("open");

    }

    @OnClose
    void onClose(Session session) {
        LOGGER.info("close");
    }

    @OnMessage
    public void onMessage(String message, Session session) {
        LOGGER.info("Message from chat "+message);
        managedExecutor.execute(() -> {

            try {
                String response = conversationService.answer(message);
                session.getBasicRemote().sendText(response);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

    }
}
