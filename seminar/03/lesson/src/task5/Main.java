/*
1. Внедрить итератор из задания 2 в коллекцию, написанную в задании 3 таким образом,
чтобы итератор был внутренним классом и, соответственно, объектом в коллекции.
 */
package task5;

import task4.*;

public class Main {
    public static void main(String[] args) {
        Person person1 = new HardWorker();
        Person person3 = new HardWorker();
        Person person5 = new HardWorker();
        Person person7 = new Idler();
        Person person9 = new Idler();

        Person[] workers = {person1, person7, person3, person9, person5};

        for (Person worker : workers) {
            System.out.println(worker);
        }
    }
}
