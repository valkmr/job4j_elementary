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

    @Test
    public void whenF5S4T9Then9() {
        int first = 5;
        int second = 4;
        int third = 9;
        int result = Max.max(first, second, third);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenF0S4T0F4Then4() {
        int first = 0;
        int second = 4;
        int third = 0;
        int fourth = 4;
        int result = Max.max(first, second, third, fourth);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

}