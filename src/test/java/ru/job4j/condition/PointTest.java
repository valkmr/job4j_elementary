package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {

    @Test
    public void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double rsl = a.distance(b);
        double expected = 2.0;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void when34ToM3M4ThenSqrt10() {
        Point a = new Point(3, 4);
        Point b = new Point(-3, -4);
        double rsl = a.distance(b);
        double expected = 10;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenM20To20Then4() {
        Point a = new Point(-2, 0);
        Point b = new Point(2, 0);
        double rsl = a.distance(b);
        double expected = 4;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenM000To002Then4() {
        Point a = new Point(0, 0, -2);
        Point b = new Point(0, 0, 2);
        double rsl = a.distance3d(b);
        double expected = 4;
        assertThat(rsl).isEqualTo(expected);
    }
}