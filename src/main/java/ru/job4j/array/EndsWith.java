package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] postfix) {

        boolean result = true;

        if (postfix.length > word.length) {
            result = false;
        } else {
            for (int i = 1; i <= postfix.length; i++) {
                if (word[word.length - i] != postfix[postfix.length - i]) {
                    result = false;
                    break;
                }
            }
        }
        return result;

    }
}
