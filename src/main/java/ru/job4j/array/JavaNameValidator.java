package ru.job4j.array;

import static java.lang.Character.*;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean value = !name.isEmpty();
        if (value && isLowerLatinLetter(name.codePointAt(0))) {
            for (int i = 1; i < name.length(); i++) {
                if (!isSpecialSymbol(name.codePointAt(i)) && !isUpperLatinLetter(name.codePointAt(i))
                            && !isLowerLatinLetter(name.codePointAt(i)) && !isDigit(name.codePointAt(i)))  {
                    value = false;
                    break;
                }
            }
        } else {
            value = false;
        }
            return value;
    }

    public static boolean isBetween(int x, int lower, int upper) {
        return lower <= x && x <= upper;
    }

    public static boolean isSpecialSymbol(int code) {
        return isBetween(code, 36,  36) || isBetween(code, 95, 95);
    }

    public static boolean isUpperLatinLetter(int code) {
        return isBetween(code, 65, 90);
    }

    public static boolean isLowerLatinLetter(int code) {
        return isBetween(code, 97, 122);
    }

}
