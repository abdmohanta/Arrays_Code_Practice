package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray50 {
    public static void main(String[] args) {
        //PROBLEM 51: MAX CIRCULAR SUBARRAY SUM
        int[] arr = {5, -3, 5};
        int totalSum = 0;
        int maxKadane = arr[0];
        int currentMax = arr[0];
        int minKadane = arr[0];
        int currentMin = arr[0];
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
            if (i > 0) {
                currentMax = Math.max(arr[i], currentMax + arr[i]);
                maxKadane = Math.max(maxKadane, currentMax);
                currentMin = Math.min(arr[i], currentMin + arr[i]);
                minKadane = Math.min(minKadane, currentMin);
            }
        }
        int circularMax;
        if (totalSum == minKadane) {
            circularMax = maxKadane;
        } else {
            circularMax = Math.max(maxKadane, totalSum - minKadane);
        }
        System.out.println("Maximum Circular Subarray Sum: " + circularMax);
    }
}