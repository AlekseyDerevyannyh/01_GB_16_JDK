/*
● Создать два класс ObjectA, ObjectB
● Реализовать класс в котором два потока при запуске провоцируют DeadLock для
объектов ObjectA, ObjectB
 */
package task01;

public class Main {
    public static void main(String[] args) {
        ObjectA objectA = new ObjectA();
        ObjectB objectB = new ObjectB();

        Runnable run1 = () -> {
            try {
                int value = objectA.getValue();
                objectB.setValue(value);
                System.out.println("value = " + value);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable run2 = () -> {
            try {
                int value = objectB.getValue();
                objectA.setValue(value);
                System.out.println("value = " + value);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread thread1 = new Thread(run1);
        Thread thread2 = new Thread(run2);

        thread1.start();
        thread2.start();
    }
}
