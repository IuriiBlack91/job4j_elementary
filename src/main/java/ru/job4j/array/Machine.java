package ru.job4j.array;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {

        if (money <= price) {                       // Проверка
            return new int[0];
        }

        int[] coins = {10, 5, 2, 1};                // Номиналы монет, отсортированные по убыванию
        int[] result = new int[100];                // Массив для хранения результата (максимум 100 монет)
        int rest = money - price;                   // Сумма сдачи
        int size = 0;                               // Начальный размер

        for (int i = 0; i < coins.length; i++) {    // Проходим по всем номиналам монет
            while (rest >= coins[i]) {              // Пока текущий номинал помещается в остаток сдачи
                result[size++] = coins[i];          // Добавляем монету в результат
                rest -= coins[i];                   // Уменьшаем остаток сдачи
            }
        }
        return Arrays.copyOf(result, size);         // Возвращаем обрезанный массив с результатом
    }
}
