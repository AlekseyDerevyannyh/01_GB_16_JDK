package developers;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FullStack devFullStack = new DeveloperFullStack();
        BackEnder devBackEnd = new DeveloperBackEnd();
        List<BackEnder> devBackEnders = Arrays.asList(devFullStack, devBackEnd);

        for (BackEnder devBackEnder : devBackEnders) {
            devBackEnder.createServer();
        }

        Developer dev = new DeveloperFrontEnd();
        if (dev instanceof FrontEnder) {
            ((FrontEnder) dev).createFront();
        }
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

class DeveloperFullStack implements Developer, FullStack {

    @Override
    public void createServer() {
        System.out.println("Create server");
    }

    @Override
    public void createFront() {
        System.out.println("Create front");
    }
}

class DeveloperBackEnd implements Developer, BackEnder {

    @Override
    public void createServer() {
        System.out.println("Crashed the server");
    }
}

class DeveloperFrontEnd implements Developer, FrontEnder {

    @Override
    public void createFront() {
        System.out.println("Crashed the front");
    }
}

interface Developer {

}