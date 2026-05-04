package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray78 {
    public static void main(String[] args) {
        // PROBLEM 79: COUNT PALINDROMIC SUBSTRINGS
        String s = "aaa";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i;
            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }
        System.out.println("Total Palindromic Substrings: " + count);
    }
}