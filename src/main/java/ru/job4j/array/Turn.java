package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        // реализация переворота массива:
        // i - индекс первого элемента , j - индекс последнего элемента
        int tmp = 0;
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
        return array;
    }
}
