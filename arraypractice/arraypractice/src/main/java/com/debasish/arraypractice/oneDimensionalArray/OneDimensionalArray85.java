package com.debasish.arraypractice.oneDimensionalArray;
import java.util.Stack;
public class OneDimensionalArray85 {
    public static void main(String[] args) {
        // PROBLEM 86: DECODE STRING
        String s = "3[a2[c]]";
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String currentString = "";
        int currentNumber = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                currentNumber = currentNumber * 10 + (ch - '0');
            }
            else if (ch == '[') {
                countStack.push(currentNumber);
                stringStack.push(currentString);
                currentNumber = 0;
                currentString = "";
            }
            else if (ch == ']') {
                int repeat = countStack.pop();
                String previous = stringStack.pop();
                String temp = "";
                for (int j = 0; j < repeat; j++) {
                    temp = temp + currentString;
                }
                currentString = previous + temp;
            }
            else {
                currentString = currentString + ch;
            }
        }
        System.out.println("Decoded String: " + currentString);
    }
}
