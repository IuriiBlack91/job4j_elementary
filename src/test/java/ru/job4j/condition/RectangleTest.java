package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RectangleTest {

    @Test
    void whenLength3AndWidth4ThenDiagonal5() {
        double length = 3;
        double width = 4;
        double expected = 5.0;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength8AndWidth12ThenDiagonal14dot42() {
        double length = 8;
        double width = 12;
        double expected = 14.42;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength6AndWidth14ThenDiagonal15dot23() {
        double length = 6;
        double width = 14;
        double expected = 15.23;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength13AndWidth21ThenDiagonal24dot69() {
        double length = 13;
        double width = 21;
        double expected = 24.69;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength25AndWidth52ThenDiagonal57dot69() {
        double length = 25;
        double width = 52;
        double expected = 57.69;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}