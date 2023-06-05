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
        int count = 0;
        int length = s.length() - 1;
        int charIndex = 0;
        while (charIndex <= length) {
            if(Character.isUpperCase(test.charAt(charIndex))) {
                count++;
            }
            charIndex++;
        }

        return count;
    }
}
