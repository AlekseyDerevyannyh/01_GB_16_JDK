package chat;

public class ServerListenerImpl implements ServerListener {
    @Override
    public void onMessageReceived(String message) {
        System.out.println("Message: " + message);
    }
}
