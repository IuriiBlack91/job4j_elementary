package ru.job4j.condition;

public class Rectangle {

    public static double diagonal(double length, double width) {
        // Вычисление диагонали прямоугольника по теореме Пифагора
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

    public static void main(String[] args) {
        double result = diagonal(3, 4);
        System.out.println("Diagonal of rectangle with length 3 and width 4 is " + result);

        result = diagonal(8, 12);
        System.out.println("Diagonal of rectangle with length 8 and width 12 is " + result);

        result = diagonal(6, 14);
        System.out.println("Diagonal of rectangle with length 6 and width 14 is " + result);

        result = diagonal(13, 21);
        System.out.println("Diagonal of rectangle with length 13 and width 21 is " + result);

        result = diagonal(25, 52);
        System.out.println("Diagonal of rectangle with length 25 and width 52 is " + result);
    }
}
