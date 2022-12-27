package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int el = 0; el < array[row].length; el++) {
                if (array[row][el] < 0) {
                    array[row][el] = 0;
                }
            }
        }
        return array;
    }
}
