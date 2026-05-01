package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray72 {
    public static void main(String[] args) {
        // PROBLEM 73: MAX CONSECUTIVE ONES (K FLIPS)
        int[] arr = {1, 0, 1, 0, 1, 0, 1};
        int k = 2;
        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;
        for (int right = 0; right < arr.length; right++) {

            if (arr[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {

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

        System.out.println("Max Consecutive Ones (K flips): " + maxLength);

    }
}