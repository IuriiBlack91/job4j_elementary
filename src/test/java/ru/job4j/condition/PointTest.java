package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints00And20Then2() {
        int x1 = 0, y1 = 0, x2 = 2, y2 = 0;
        double expected = 2.0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2AndMinus2And22Then5dot65() {
        int x1 = -2, y1 = -2, x2 = 2, y2 = 2;
        double expected = 5.65;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints21And1dot5And3dot5Then2dot23() {
        int x1 = 2, y1 = 1;
        double x2 = 1.5, y2 = 3.5;
        double expected = 2.23;
        double output = Point.distance(x1, y1, (int) x2, (int) y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}