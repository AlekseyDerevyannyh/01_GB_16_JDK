/*
Написать класс Калькулятор (необобщённый), который содержит обобщённые статические методы: sum(),
multiply(), divide(), subtract(). Параметры этих методов - два числа разного типа, над
которыми должна быть произведена операция.
 */
package task6;

public class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.sum(123, 5L));
        System.out.println(Calculator.multiply(123, 5L));
        System.out.println(Calculator.divide(125, 5L));
        System.out.println(Calculator.subtract(123, 5L));
    }
}
