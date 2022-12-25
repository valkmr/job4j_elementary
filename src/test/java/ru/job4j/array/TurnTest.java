package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsTheyTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {1, 1, 3, 2, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 2, 3, 1, 1};
        assertThat(result).containsExactly(expected);
    }
}