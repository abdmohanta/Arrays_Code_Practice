package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray66 {
    public static void main(String[] args) {
        // PROBLEM 67: FIND DUPLICATE (FLOYD CYCLE)
        int[] arr = {1, 3, 4, 2, 2};
        int slow = arr[0];
        int fast = arr[0];
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);
        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        System.out.println("Duplicate Number: " + slow);
    }
}