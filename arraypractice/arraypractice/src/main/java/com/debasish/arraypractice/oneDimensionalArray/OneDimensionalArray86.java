package com.debasish.arraypractice.oneDimensionalArray;

import java.util.Stack;

public class OneDimensionalArray86 {

    public static void main(String[] args) {
        String path = "/a/./b/../../c/";
        String[] parts = path.split("/");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < parts.length; i++) {
            String dir = parts[i];
            if (dir.equals("") || dir.equals(".")) {
                continue;
            }

            else if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }

            else {
                stack.push(dir);
            }
        }

        String result = "";

        for (String dir : stack) {
            result = result + "/" + dir;
        }

        if (result.equals("")) {
            result = "/";
        }

        System.out.println("Simplified Path: " + result);

    }
}