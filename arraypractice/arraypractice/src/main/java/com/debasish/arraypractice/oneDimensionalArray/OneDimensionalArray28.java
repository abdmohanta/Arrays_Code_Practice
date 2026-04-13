package com.debasish.arraypractice.oneDimensionalArray;
import java.util.Arrays;
public class OneDimensionalArray28 {
    public static void main(String[] args) {
        // PROBLEM 29: REARRANGE POSITIVE & NEGATIVE
        int[] arr = {1, -2, 3, -4, -1, 4};
        int n = arr.length;
        int[] pos = new int[n];
        int[] neg = new int[n];
        int p = 0, q = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                pos[p++] = arr[i];
            } else {
                neg[q++] = arr[i];
            }
        }

        int i = 0, j = 0, k = 0;
        while (i < p && j < q) {
            arr[k++] = pos[i++];
            arr[k++] = neg[j++];
        }
        while (i < p) {
            arr[k++] = pos[i++];
        }
        while (j < q) {
            arr[k++] = neg[j++];
        }
        System.out.println("Rearranged Array: " + Arrays.toString(arr));
    }
}