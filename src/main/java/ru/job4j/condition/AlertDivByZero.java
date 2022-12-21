package ru.job4j.condition;

public class AlertDivByZero {
    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Couldn't div by 0.");
        } else  if (number < 0) {
            System.out.println("This is a negative number");
        } else {
            System.out.println("This is a positive number");
        }
    }

    public static void main(String[] args) {
        AlertDivByZero.possibleDiv(1);
        AlertDivByZero.possibleDiv(-4);
        AlertDivByZero.possibleDiv(0);
    }
}
