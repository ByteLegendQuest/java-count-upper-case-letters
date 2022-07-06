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
        int c = 0;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                c++;
            }
        }
        return c;
    }
}
