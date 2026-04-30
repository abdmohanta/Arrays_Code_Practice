package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray71 {
    public static void main(String[] args) {
        // PROBLEM 72: MAX CONSECUTIVE ONES (1 FLIP)
        int[] arr = {1, 0, 1, 1, 0};
        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;

        for (int right = 0; right < arr.length; right++) {

            if (arr[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > 1) {
                if (arr[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            int length = right - left + 1;
            if (length > maxLength) {
                maxLength = length;
            }
        }
        System.out.println("Max Consecutive Ones (with 1 flip): " + maxLength);

    }
}