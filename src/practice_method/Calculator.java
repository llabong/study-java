package practice_method;

public class Calculator {
    public static int add (int a, int b) {
        return a + b;
    }

    public static int multiply (int a, int b) {
        return a * b;
    }

    public static float average (int a, int b) {
        return (a + b) / 2f; // 2보단 float 나누기인 2f 활용!
    }

    public static int max (int a, int b) {
        return Math.max(a, b);
    }
}
