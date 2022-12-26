package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int temp;
        int min;
        int in;

        for (int index = 0; index < data.length - 1; index++) {
            min = MinDiapason.findMin(data, index, data.length - 1);
            in = FindLoop.indexInRange(data, min, index, data.length - 1);
            if (in != index) {
                temp = data[index];
                data[index] = min;
                data[in] = temp;
            }
        }
        return data;
    }
}
