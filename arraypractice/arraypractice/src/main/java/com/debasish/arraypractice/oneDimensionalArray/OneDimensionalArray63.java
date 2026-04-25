package com.debasish.arraypractice.oneDimensionalArray;
import java.util.HashMap;
import java.util.Map;
public class OneDimensionalArray63 {
    public static void main(String[] args) {
        // PROBLEM 64: TOP K FREQUENT ELEMENTS
        int[] arr = {1, 1, 1, 2, 2, 3};
        int k = 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println("Top " + k + " Frequent Elements:");
        for (int i = 0; i < k; i++) {
            int maxFreq = Integer.MIN_VALUE;
            int element = -1;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxFreq) {
                    maxFreq = entry.getValue();
                    element = entry.getKey();
                }
            }

            System.out.println(element);
            map.remove(element);
        }

    }
}