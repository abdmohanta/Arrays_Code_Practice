package com.debasish.arraypractice.oneDimensionalArray;

import java.util.Stack;

public class OneDimensionalArray81 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 82: MIN STACK
        // ======================================

        // main stack
        Stack<Integer> stack = new Stack<>();

        // min stack
        Stack<Integer> minStack = new Stack<>();

        // PUSH OPERATIONS
        int[] inputs = {5, 3, 7, 2, 8};

        for (int i = 0; i < inputs.length; i++) {

            int val = inputs[i];

            stack.push(val);

            // update min stack
            if (minStack.isEmpty() || val <= minStack.peek()) {
                minStack.push(val);
            }
        }

        // PRINT CURRENT MIN
        System.out.println("Current Min: " + minStack.peek());

        // POP OPERATION
        int popped = stack.pop();

        if (popped == minStack.peek()) {
            minStack.pop();
        }

        System.out.println("After Pop, New Min: " + minStack.peek());

    }
}