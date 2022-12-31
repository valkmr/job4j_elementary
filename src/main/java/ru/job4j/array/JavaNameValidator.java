package ru.job4j.array;

import static java.lang.Character.*;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean value = !name.isEmpty() && isLowerLatinLetter(name.codePointAt(0));
        if (value) {
            for (int i = 1; i < name.length(); i++) {
                if (!isSpecialSymbol(name.codePointAt(i)) && !isUpperLatinLetter(name.codePointAt(i))
                            && !isLowerLatinLetter(name.codePointAt(i)) && !isDigit(name.codePointAt(i)))  {
                    value = false;
                    break;
                }
            }
        }
            return value;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }

}
