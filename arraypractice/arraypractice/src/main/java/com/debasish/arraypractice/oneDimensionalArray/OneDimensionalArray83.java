package com.debasish.arraypractice.oneDimensionalArray;

import java.util.Arrays;
public class OneDimensionalArray83 {
    public static void main(String[] args) {
        // PROBLEM 84: DAILY TEMPERATURES
        int[] temp = {73, 74, 75, 71, 69, 72, 76, 73};
        int n = temp.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (temp[j] > temp[i]) {
                    result[i] = j - i;
                    break;
                }
            }
        }

        System.out.println("Days to Wait: " + Arrays.toString(result));

    }
}