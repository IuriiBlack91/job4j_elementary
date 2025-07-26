package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class VectorTest {

    @Test
    void whenVectors12And34ThenResult46() {
        int x1 = 1, y1 = 2, x2 = 3, y2 = 4;
        String expected = "(4, 6)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenVectorsMinus12And31ThenResult2Minus1() {
        int x1 = -1, y1 = -2, x2 = 3, y2 = 1;
        String expected = "(2, -1)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenVectorsMinus13And12ThenResult0Minus1() {
        int x1 = -1, y1 = -3, x2 = 1, y2 = 2;
        String expected = "(0, -1)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenVectors2Minus2AndMinus2And2ThenResult00() {
        int x1 = 2, y1 = -2, x2 = -2, y2 = 2;
        String expected = "(0, 0)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }
}