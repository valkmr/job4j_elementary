package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left <= right ? right : left;
    }

    public static int max(int first, int second, int third) {
        int maxtwo = max(first, second);
        return maxtwo >= third ? maxtwo : third;
    }

    public static int max(int first, int second, int third, int fourth) {
        int maxthree = max(first, second, third);
        return maxthree >= fourth ? maxthree : third;
    }
}
