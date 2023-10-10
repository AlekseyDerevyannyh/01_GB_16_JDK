package chat;

public class SocketThreadListenerImplServer implements SocketThreadListener {
    @Override
    public void prsBtnStart() {
        System.out.println("SERVER LOG: Command received 'Start Server'");
    }

    @Override
    public void prsBtnStop() {
        System.out.println("SERVER LOG: Command received 'Stop Server'");
    }
}
