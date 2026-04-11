package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray18 {
    public static void main(String[] args) {
        // PROBLEM 19: FIND DUPLICATE ELEMENT
        int[] arr = {1, 2, 3, 2, 4, 5, 3};
        System.out.println("Duplicate Elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
