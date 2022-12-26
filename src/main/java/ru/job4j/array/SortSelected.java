package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int min;
        int in;

        for (int index = 0; index < data.length - 1; index++) {
            min = MinDiapason.findMin(data, index, data.length - 1);
            in = FindLoop.indexInRange(data, min, index, data.length - 1);
            if (in != index) {
                SwitchArray.swap(data, index, in);
            }
        }
        return data;
    }
}
