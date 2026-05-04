package com.debasish.arraypractice.oneDimensionalArray;
import java.util.HashMap;
public class OneDimensionalArray75 {
    public static void main(String[] args) {
        // PROBLEM 76: CHECK ANAGRAM (SLIDING WINDOW)
        String s = "cbaebabacd";
        String t = "abc";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int count = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);

                if (map.get(ch) >= 0) {
                    count++;
                }
            }

            if (right - left + 1 > t.length()) {

                char leftChar = s.charAt(left);

                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);

                    if (map.get(leftChar) > 0) {
                        count--;
                    }
                }

                left++;
            }

            if (count == t.length()) {
                System.out.println("Anagram found");
                return;
            }
        }

        System.out.println("No anagram found");

    }
}