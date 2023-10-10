package chat;

public class Main {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer(new ServerListenerImpl(), new ServerSocketThreadListenerImpl(), new SocketThreadListenerImplServer());
        new ServerWindow(chatServer, new SocketThreadListenerImplClient());
    }
}
