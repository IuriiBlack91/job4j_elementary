package ru.job4j.array;

public class TwoNumbersSum {

    public static int[] getIndexes(int[] array, int target) {

        if (array == null) {                 // Массив не null
            return new int[0];
        }
        if (array.length < 2) {             // В массиве минимум 2 элемента
            return new int[0];
        }

        int left = 0;                         // Указатель на начало массива
        int right = array.length - 1;         // Указатель на конец массива

        for (; left < right;) {                // Пока указатели не встретились
            int sum = array[left] + array[right]; // Считаем сумму пары

            if (sum == target) {              // Если сумма равна цели
                return new int[]{left, right}; // Возвращаем индексы этой пары
            } else if (sum < target) {        // Если сумма меньше цели
                left++;                       // Сдвигаем левый указатель вправо
            } else {                          // Если сумма больше цели
                right--;                      // Сдвигаем правый указатель влево
            }
        }

        return new int[0];                    // Пара не найдена — возвращаем пустой массив
    }
}
