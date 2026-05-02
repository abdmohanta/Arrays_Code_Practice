package com.debasish.arraypractice.oneDimensionalArray;

import java.util.HashSet;

public class OneDimensionalArray73 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 74: LONGEST SUBSTRING (NO REPEAT)
        // ======================================

        // Step 1: create string
        String s = "abcabcbb";

        int left = 0;
        int maxLength = 0;

        HashSet<Character> set = new HashSet<>();

        // Step 2: sliding window
        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // remove duplicates
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);

            int length = right - left + 1;

            if (length > maxLength) {
                maxLength = length;
            }
        }

        // Step 3: print result
        System.out.println("Longest Substring Length: " + maxLength);

    }
}