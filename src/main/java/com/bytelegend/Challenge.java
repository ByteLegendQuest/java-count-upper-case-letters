package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(countUpperCaseLetters("AaBbCc1234ABC"));
    }

    /**
     * `countUpperCaseLetters()` method returns the number of upper case letters in the given
     * English string.
     *
     * <p>For example, `countUpperCaseLetters("1A2B3C4d")` returns `3`.
     */
    public static int countUpperCaseLetters(String s) {
        int i = 0, count = 0, len = s.length();

        while (i < len) {
            char a = s.charAt(i);
            if (a >= 'A' && a <= 'Z') {
                count++;
            }
            i++;
        }
        return count;
    }
}
