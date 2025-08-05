package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {

    @Test
    void whenSortThreeNumbers() {
        int[] data = new int[] {9, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 5, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSortFiveNumbers() {
        int[] data = new int[] {8, 3, 5, 1, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 5, 7, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }
}