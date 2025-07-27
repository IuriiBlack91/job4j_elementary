package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // Сумма чисел
        System.out.println(sum(0, 5));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(5, 1));
        System.out.println(sum(3, 3));

        // Сумма чётных чисел
        System.out.println(sumByEven(1, 10));   // 30
        System.out.println(sumByEven(9, 1));    // 0
        System.out.println(sumByEven(6, 6));    // 6
        System.out.println(sumByEven(10, 10));  // 10
        System.out.println(sumByEven(1, 100));  // 2550
        System.out.println(sumByEven(-2, 88));  // 1978
    }
}
