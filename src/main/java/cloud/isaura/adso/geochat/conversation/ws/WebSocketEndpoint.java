package cloud.isaura.adso.geochat.conversation.ws;
import cloud.isaura.adso.geochat.conversation.ConversationAgent;
import jakarta.inject.Inject;
import jakarta.websocket.OnClose;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;
import org.eclipse.microprofile.context.ManagedExecutor;
import org.jboss.logging.Logger;

import java.io.IOException;


@ServerEndpoint("/chatbot")
public class WebSocketEndpoint
{

    private static final Logger LOGGER = Logger.getLogger("WebSocket");
    @Inject
    ManagedExecutor managedExecutor;

    @Inject
    ConversationAgent conversationAgent;

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
                String response = conversationAgent.answer(message);
                session.getBasicRemote().sendText(response);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

    }
}
