package ru.job4j.condition;

public class Point {
    // текст...
    public static double distance(int x1, int y1, int x2, int y2) {
        // Используем теорему Пифагора для расчёта расстояния
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        result = distance(-2, -2, 2, 2);
        System.out.println("result (-2, -2) to (2, 2) " + result);

        result = distance(2, 1, 1.5, 3.5);
        System.out.println("result (2, 1) to (1.5, 3.5) " + result);

        result = distance(0.5, 0.5, 5.5, 2.5);
        System.out.println("result (0.5, 0.5) to (5.5, 2.5) " + result);
    }
}
