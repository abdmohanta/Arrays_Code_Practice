package com.debasish.arraypractice.oneDimensionalArray;
import java.util.Arrays;
public class OneDimensionalArray11 {
    public static void main(String[] args) {
        // PROBLEM 12: REMOVE DUPLICATES
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j] = arr[i];
                j++;
            }
        }
        temp[j] = arr[arr.length - 1];
        System.out.print("Unique Elements: ");

        for (int i = 0; i <= j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}