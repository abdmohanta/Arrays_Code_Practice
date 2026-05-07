package com.debasish.arraypractice.oneDimensionalArray;

import java.util.Stack;

public class OneDimensionalArray86 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 87: SIMPLIFY PATH
        // ======================================

        // Step 1: input path
        String path = "/a/./b/../../c/";

        // Step 2: split path
        String[] parts = path.split("/");

        Stack<String> stack = new Stack<>();

        // Step 3: process directories
        for (int i = 0; i < parts.length; i++) {

            String dir = parts[i];

            // ignore empty and current directory
            if (dir.equals("") || dir.equals(".")) {
                continue;
            }

            // go back
            else if (dir.equals("..")) {

                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }

            // normal directory
            else {
                stack.push(dir);
            }
        }

        // Step 4: build simplified path
        String result = "";

        for (String dir : stack) {
            result = result + "/" + dir;
        }

        // Step 5: handle root
        if (result.equals("")) {
            result = "/";
        }

        // Step 6: print result
        System.out.println("Simplified Path: " + result);

    }
}