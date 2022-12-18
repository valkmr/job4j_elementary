package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double divisionAndSubtraction(double first, double second) {
        return division(first, second) + subtraction(first, second);
    }

    public static double sumAndMulAndDivAndSub(double first, double second) {
        return sum(first, second) + multiply(first, second) + division(first, second) + subtraction(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Расчёт суммы и умножения = " + sumAndMultiply(10, 20));
        System.out.println("Расчет вычитания и деления = " + divisionAndSubtraction(10, 20));
        System.out.println("Расчет суммы, вычитания, деления и умножения = " + sumAndMulAndDivAndSub(10, 20));
    }
}
