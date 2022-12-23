package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        int finish = (int) Math.sqrt(number);
        for (int index = 2; index <= finish; index++) {
            if (number % index == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

}
