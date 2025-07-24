package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RblThen2Euro() {
        double input = 140;
        double expected = 2;
        double ouptut = Converter.rubleToEuro(input);
        double value = 0.0001;
        assertThat(ouptut).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert180RblThen3Dollar() {
        double input = 180;
        double expected = 3;
        double output = Converter.rubleToDollar(input);
        double value = 0.0001;
        assertThat(output).isEqualTo(expected, withPrecision(value));

    }
}