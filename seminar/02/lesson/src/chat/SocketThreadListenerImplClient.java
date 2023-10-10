package chat;

public class SocketThreadListenerImplClient implements SocketThreadListener {
    @Override
    public void prsBtnStart() {
        System.out.println("CLIENT LOG: Button Start pressed");
    }

    @Override
    public void prsBtnStop() {
        System.out.println("CLIENT LOG: Button Stop pressed");
    }
}
