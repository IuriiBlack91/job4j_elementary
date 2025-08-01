package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {

        int count = 1;

        for (int i = 3; i <= finish; i += 2) {
            boolean isPrime = true;
            for (int j = 3; j * j <= i; j += 2) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        return count;
    }
}
