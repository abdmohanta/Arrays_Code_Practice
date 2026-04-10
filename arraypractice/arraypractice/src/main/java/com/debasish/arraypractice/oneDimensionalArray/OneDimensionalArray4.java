package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray4 {
    public static void main(String[] args) {
        // PROBLEM 4: FIND MIN ELEMENT
        int[] arr = {10, 25, 5, 40, 15};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum Element: " + min);
    }
}
