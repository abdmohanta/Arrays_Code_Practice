package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray38 {

    public static void main(String[] args) {
        // PROBLEM 39: MAX PRODUCT SUBARRAY
        int[] arr = {2, 3, -2, 4};

        int mxProduct = arr[0];
        int currentMax = arr[0];
        int currentMin = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int temp = currentMax;
            currentMax = Math.max(arr[i],
                    Math.max(currentMax * arr[i], currentMin * arr[i]));

            currentMin = Math.min(arr[i],
                    Math.min(temp * arr[i], currentMin * arr[i]));

            if (currentMax > maxProduct) {
                maxProduct = currentMax;
            }
        }
        System.out.println("Maximum Product: " + maxProduct);

    }
}