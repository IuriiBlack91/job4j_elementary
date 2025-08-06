package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] postfix) {

        boolean result = true;

        for (int i = 1; i <= postfix.length; i++) {
            if (word.length - i < 0 || word[word.length - i]
                != postfix[postfix.length - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
