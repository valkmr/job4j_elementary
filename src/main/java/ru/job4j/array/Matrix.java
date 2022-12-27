package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int el = 0; el < size; el++) {
                array[row][el] = (row + 1) * (el + 1);
            }
        }
        return array;
    }
}
