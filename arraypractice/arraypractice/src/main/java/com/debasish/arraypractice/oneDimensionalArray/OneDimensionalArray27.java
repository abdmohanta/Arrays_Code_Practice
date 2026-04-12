package com.debasish.arraypractice.oneDimensionalArray;
import java.util.Arrays;
public class OneDimensionalArray27 {
    public static void main(String[] args) {
        // PROBLEM 28: LONGEST CONSECUTIVE SEQUENCE
        int[] arr = {100, 4, 200, 1, 3, 2};
        Arrays.sort(arr);

        int longest = 1;
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                count++;
            }
            else if (arr[i] != arr[i - 1]) {
                count = 1;
            }
            if (count > longest) {
                longest = count;
            }
        }
        System.out.println("Longest Consecutive Length: " + longest);
    }
}