package Homework3;

import java.util.Stack;

/**
 * Created by Евгений on 19.05.2018.
 */

public class Task3_2 {

    public String bracketValidation(String input) {

        String result;
        Stack<Character> stack = new Stack<>();

        switch (input.charAt(0)) {
            case ')':
            case ']':
            case '}':
                result = "input isn,t correct";
                return result;
        }

        switch (input.charAt(input.length() - 1)) {
            case '(':
            case '[':
            case '{':
                result = "input isn,t correct";
                return result;
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(' || input.charAt(i) == '[' || input.charAt(i) == '{') {
                stack.push(input.charAt(i));

            } else if (input.charAt(i) == ')' && stack.peek() == '(') {
                stack.pop();

            } else if (input.charAt(i) == ']' && stack.peek() == '[') {
                stack.pop();

            } else if (input.charAt(i) == '}' && stack.peek() == '{') {
                stack.pop();

            } else {
                result = "input isn,t correct";
                return result;
            }
        }

        result = "input is correct";
        return result;
    }
}
