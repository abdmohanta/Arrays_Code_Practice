package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray30 {
    public static void main(String[] args) {
        // PROBLEM 31: FIND LEADERS IN ARRAY
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        int maxFromRight = arr[n - 1];
        System.out.println("Leaders:");
        System.out.println(maxFromRight);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.println(maxFromRight);
            }
        }
    }
}