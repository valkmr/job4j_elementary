package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5Same() {
        int[] data = new int[] {1, 1, 1, 1, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 1, 1, 1, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {2, 1, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 2};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {109, -1, -2, 109};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-2, -1, 109, 109};
        assertThat(result).containsExactly(expected);
    }
}