package ru.job4j.array;

import javax.xml.transform.SourceLocator;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("ages length " + ages.length);

        String[] surnames = new String[100500];
        System.out.println("surnames length " + surnames.length);

        float[] prices = new float[40];
        System.out.println("prices length " + prices.length);

        String[] names = new String[4];
        names[0] = "Valerii";
        names[1] = "Anna";
        names[2] = "Veles";
        names[3] = "Vesta";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
