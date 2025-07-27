package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenStartIsBigThanFinishResultIs0() {
        int start = 10;
        int finish = 5;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStartLessThanFinishResultIs15() {
        int start = 0;
        int finish = 5;
        int expected = 15;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStartEqualsFinishResultIs3() {
        int start = 3;
        int finish = 3;
        int expected = 3;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart1Finish10SumEvenIs30() {
        int start = 1;
        int finish = 10;
        int output = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart9Finish1SumEvenIs0() {
        int start = 9;
        int finish = 1;
        int output = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart6Finish6SumEvenIs6() {
        int start = 6;
        int finish = 6;
        int output = Counter.sumByEven(start, finish);
        int expected = 6;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart10Finish10SumEvenIs10() {
        int start = 10;
        int finish = 10;
        int output = Counter.sumByEven(start, finish);
        int expected = 10;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart1Finish100SumEvenIs2550() {
        int start = 1;
        int finish = 100;
        int output = Counter.sumByEven(start, finish);
        int expected = 2550;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStartMinus2FinishMinus88SumEvenIs1978() {
        int start = -2;
        int finish = 88;
        int output = Counter.sumByEven(start, finish);
        int expected = 1978;
        assertThat(output).isEqualTo(expected);
    }
}
