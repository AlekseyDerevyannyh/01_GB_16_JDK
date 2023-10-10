package chat;

public class ChatServer {
    private boolean serverStatus;
    private final ServerListener serverListener;
    private final ServerSocketThreadListener serverSocketThreadListener;
    private final SocketThreadListener socketThreadListener;


    public ChatServer(ServerListener serverListener, ServerSocketThreadListener serverSocketThreadListener, SocketThreadListener socketThreadListener) {
        this.serverStatus = false;
        this.serverListener = serverListener;
        this.serverSocketThreadListener = serverSocketThreadListener;
        this.socketThreadListener = socketThreadListener;
    }

    public void start() {
        socketThreadListener.prsBtnStart();

        if (serverStatus){
            serverListener.onMessageReceived("Server already started");
        } else {
            serverSocketThreadListener.onStart();
            serverStatus = true;
            serverListener.onMessageReceived("Server started");
        }
    }

    public void stop() {
        socketThreadListener.prsBtnStop();
        if (serverStatus){
            serverSocketThreadListener.onStop();
            serverStatus = false;
            serverListener.onMessageReceived("Server stopped");
        } else {
            serverListener.onMessageReceived("Server already stopped");
        }
    }
}
