package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray70 {
    public static void main(String[] args) {
        // PROBLEM 71: MAXIMUM CONSECUTIVE ONES
        int[] arr = {1, 1, 0, 1, 1, 1};
        int maxCount = 0;
        int currentCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                currentCount++;
            } else {
                currentCount = 0;
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
        }
        System.out.println("Maximum Consecutive Ones: " + maxCount);

    }
}