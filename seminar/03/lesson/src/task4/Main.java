/*
Описать интерфейс Person с методами doWork() и haveRest(). Написать два класса работник и бездельник,
реализующих интерфейс. Работник работает, и не умеет бездельничать, в то время как бездельник не умеет
работать, но умеет отдыхать. Написать обобщённые классы Workplace и Club, содержащие массив из Person.
В классах необходимо вызывать у всего массива людей вызывать соответствующие методы.
*/

package task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person1 = new HardWorker();
        Person person2 = new HardWorker();
        Person person3 = new HardWorker();
        Person person4 = new HardWorker();
        Person person5 = new HardWorker();
        Person person6 = new Idler();
        Person person7 = new Idler();
        Person person8 = new Idler();
        Person person9 = new Idler();
        Person person10 = new Idler();

        Person[] workers = {person1, person7, person3, person9, person5};
        Person[] idlers = {person6, person2, person8, person4, person10};

        WorkPlace<? extends Person> factory = new WorkPlace<>(workers);
        NightClub<? extends Person> club = new NightClub<>(idlers);

        factory.workForAll();
        club.partyForAll();
    }
}
