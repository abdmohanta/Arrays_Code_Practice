package com.debasish.arraypractice.oneDimensionalArray;
import java.util.Arrays;
public class OneDimensionalArray64 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 65: MEDIAN OF TWO SORTED ARRAYS
        // ======================================

        // Step 1: create arrays
        int[] a = {1, 3};
        int[] b = {2};

        int n1 = a.length;
        int n2 = b.length;

        // Step 2: merge arrays
        int[] merge = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {

            if (a[i] < b[j]) {
                merge[k++] = a[i++];
            } else {
                merge[k++] = b[j++];
            }
        }

        while (i < n1) {
            merge[k++] = a[i++];
        }

        while (j < n2) {
            merge[k++] = b[j++];
        }

        // Step 3: find median
        int n = merge.length;

        if (n % 2 == 0) {
            double median = (merge[n / 2] + merge[n / 2 - 1]) / 2.0;
            System.out.println("Median: " + median);
        } else {
            System.out.println("Median: " + merge[n / 2]);
        }

    }
}