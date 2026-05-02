package com.debasish.arraypractice.oneDimensionalArray;

import java.util.HashMap;

public class OneDimensionalArray74 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 75: MINIMUM WINDOW SUBSTRING
        // ======================================

        // Step 1: input strings
        String s = "ADOBECODEBANC";
        String t = "ABC";

        // Step 2: store frequency of t
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int count = 0;

        int minLength = Integer.MAX_VALUE;
        int startIndex = 0;

        // Step 3: sliding window
        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);

                if (map.get(ch) >= 0) {
                    count++;
                }
            }

            // shrink window
            while (count == t.length()) {

                int length = right - left + 1;

                if (length < minLength) {
                    minLength = length;
                    startIndex = left;
                }

                char leftChar = s.charAt(left);

                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);

                    if (map.get(leftChar) > 0) {
                        count--;
                    }
                }

                left++;
            }
        }

        // Step 4: print result
        if (minLength == Integer.MAX_VALUE) {
            System.out.println("No window found");
        } else {
            System.out.println("Minimum Window: " +
                    s.substring(startIndex, startIndex + minLength));
        }

    }
}