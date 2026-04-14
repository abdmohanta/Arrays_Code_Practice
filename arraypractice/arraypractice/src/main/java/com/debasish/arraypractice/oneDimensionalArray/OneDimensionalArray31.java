package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray31 {
    public static void main(String[] args) {
        // PROBLEM 32: EQUILIBRIUM INDEX
        int[] arr = {1, 3, 5, 2, 2};
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum - arr[i];
            if (leftSum == totalSum) {
                System.out.println("Equilibrium Index: " + i);
                break;
            }
            leftSum = leftSum + arr[i];
        }
    }
}
