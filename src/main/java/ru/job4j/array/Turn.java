package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {

        int[] tempArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            tempArray[array.length - 1 - i] = array[i];
        }
        return tempArray;
    }
}
