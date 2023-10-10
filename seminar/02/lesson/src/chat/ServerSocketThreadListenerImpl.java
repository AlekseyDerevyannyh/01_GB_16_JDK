package chat;

public class ServerSocketThreadListenerImpl implements ServerSocketThreadListener {

    @Override
    public void onStart() {
        System.out.println("SERVER LOG: Server started");
    }

    @Override
    public void onStop() {
        System.out.println("SERVER LOG: Server stopped");
    }
}
