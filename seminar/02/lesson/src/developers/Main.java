package developers;

public class Main {
    public static void main(String[] args) {
        FullStack devFullStack = new DeveloperFullStack();
        devFullStack.createFront();
        devFullStack.createServer();

        BackEnder devBackEnd = new DeveloperBackEnd();
        devBackEnd.createServer();
    }
}

interface BackEnder {
    void createServer();
}

interface FrontEnder {
    void createFront();
}

interface FullStack extends BackEnder, FrontEnder {

}

class DeveloperFullStack implements FullStack {

    @Override
    public void createServer() {
        System.out.println("Make server");
    }

    @Override
    public void createFront() {
        System.out.println("Make front");
    }
}

class DeveloperBackEnd implements BackEnder {

    @Override
    public void createServer() {
        System.out.println("Crashed the server");
    }
}