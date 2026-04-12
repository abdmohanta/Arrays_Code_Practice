package com.debasish.arraypractice.oneDimensionalArray;
import java.util.Arrays;
public class OneDimensionalArray20 {
    public static void main(String[] args) {
        // PROBLEM 21: UNION OF TWO ARRAYS
        int[] a = {1, 2, 3};
        int[] b = {3, 4, 5};
        int[] merge = new int[a.length + b.length];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            merge[k++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            merge[k++] = b[i];
        }
        int[] temp = new int[merge.length];
        int j = 0;

        for (int i = 0; i < merge.length; i++) {

            boolean isDuplicate = false;

            for (int x = 0; x < j; x++) {
                if (merge[i] == temp[x]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[j++] = merge[i];
            }
        }
        System.out.print("Union Elements: ");

        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }

    }
}
