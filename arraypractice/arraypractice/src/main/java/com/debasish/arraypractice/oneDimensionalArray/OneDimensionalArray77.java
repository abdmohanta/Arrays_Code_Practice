package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray77 {
    public static void main(String[] args) {
        // PROBLEM 78: LONGEST PALINDROMIC SUBSTRING
        String s = "babad";
        int start = 0;
        int maxLength = 1;
        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {

                int length = right - left + 1;

                if (length > maxLength) {
                    start = left;
                    maxLength = length;
                }

                left--;
                right++;
            }

            left = i;
            right = i + 1;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {

                int length = right - left + 1;

                if (length > maxLength) {
                    start = left;
                    maxLength = length;
                }

                left--;
                right++;
            }
        }

        System.out.println("Longest Palindrome: " +
                s.substring(start, start + maxLength));

    }
}