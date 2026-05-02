package com.debasish.arraypractice.oneDimensionalArray;
import java.util.HashSet;
public class OneDimensionalArray73 {
    public static void main(String[] args) {
        // PROBLEM 74: LONGEST SUBSTRING (NO REPEAT)
        String s = "abcabcbb";
        int left = 0;
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
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
        System.out.println("Longest Substring Length: " + maxLength);

    }
}