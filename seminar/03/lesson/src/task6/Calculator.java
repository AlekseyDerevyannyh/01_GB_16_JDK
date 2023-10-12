package task6;

public class Calculator {
    public static <T extends Number, E extends Number> Double sum(T first, E second) {
        return first.doubleValue() + second.doubleValue();
    }

    public static <T extends Number, E extends Number> Double multiply(T first, E second) {
        return first.doubleValue() * second.doubleValue();
    }

    public static <T extends Number, E extends Number> Double divide(T first, E second) {
        return first.doubleValue() / second.doubleValue();
    }

    public static <T extends Number, E extends Number> Double subtract(T first, E second) {
        return first.doubleValue() - second.doubleValue();
    }
}
