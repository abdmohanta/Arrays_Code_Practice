package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray78 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 79: COUNT PALINDROMIC SUBSTRINGS
        // ======================================

        // Step 1: input string
        String s = "aaa";

        int count = 0;

        // Step 2: check all centers
        for (int i = 0; i < s.length(); i++) {

            // odd length
            int left = i;
            int right = i;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {

                count++;
                left--;
                right++;
            }

            // even length
            left = i;
            right = i + 1;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {

                count++;
                left--;
                right++;
            }
        }

        // Step 3: print result
        System.out.println("Total Palindromic Substrings: " + count);

    }
}