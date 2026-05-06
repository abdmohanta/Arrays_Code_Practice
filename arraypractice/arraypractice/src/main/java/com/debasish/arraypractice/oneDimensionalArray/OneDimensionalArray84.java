package com.debasish.arraypractice.oneDimensionalArray;

import java.util.Stack;

public class OneDimensionalArray84 {

    public static void main(String[] args) {
        // PROBLEM 85: ASTEROID COLLISION
        // ======================================

        // Step 1: create array
        int[] asteroids = {5, 10, -5};

        Stack<Integer> stack = new Stack<>();

        // Step 2: process asteroids
        for (int i = 0; i < asteroids.length; i++) {

            int current = asteroids[i];

            boolean exploded = false;

            // collision condition
            while (!stack.isEmpty()
                    && current < 0
                    && stack.peek() > 0) {

                int top = stack.peek();

                // top asteroid smaller
                if (Math.abs(current) > top) {
                    stack.pop();
                    continue;
                }

                // equal size
                else if (Math.abs(current) == top) {
                    stack.pop();
                }

                exploded = true;
                break;
            }

            // add asteroid if not exploded
            if (!exploded) {
                stack.push(current);
            }
        }

        // Step 3: print remaining asteroids
        System.out.println("Remaining Asteroids:");

        for (int val : stack) {
            System.out.print(val + " ");
        }

    }
}