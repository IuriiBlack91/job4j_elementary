package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumTwoOperationsForSubAndDiv(double first, double second) {
        return subtraction(first, second)
                + division(first, second);
    }

    public static double sumCalcAllFourOperations(
            double first, double second, double third,double fourth) {
         return sum(first, second) + multiply(first, second)
                + subtraction(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчёта равен: " + sumAndMultiply(10, 20));

        System.out.println(
                "Сумма двух операций, разность 2х чисел и деление 2х чисел:" +
                sumTwoOperationsForSubAndDiv(5, 10));

        System.out.println("Сумма вычисления всех четырех операций:" +
                sumCalcAllFourOperations(sum(20,15), multiply(3, 21),
                        subtraction(93,22), division(32, 13)));

    }
}
