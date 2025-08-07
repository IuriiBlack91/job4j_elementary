package ru.job4j.array;

public class AlgoArray {

    public static void main(String[] args) {

        // массив , меняем местами ячейки (5 и 1):
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;

        // массив до сортировки:
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + "| ");
        }

        System.out.println();

        // массив после сортировки (по возрастанию):
        for (int index = 0; index < array.length; index++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int xTemp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = xTemp;
                }
            } System.out.print(array[index] + "| ");
        }
    }
}
