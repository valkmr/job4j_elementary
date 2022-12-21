package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenL1R2Then2() {
        int left = -3;
        int right = -2;
        int result = Max.max(left, right);
        int expected = -2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenL10R0Then10() {
        int left = 10;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenL0R0Then0() {
        int left = 0;
        int right = 0;
        int result = Max.max(left, right);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}