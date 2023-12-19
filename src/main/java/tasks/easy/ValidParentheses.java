package tasks.easy;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> openStack = new Stack<>();

        for (char c : arr) {
            if (c == '(' || c == '[' || c == '{') {
                openStack.push(c);
            } else {
                if (!openStack.empty()) {
                    char open = openStack.pop();
                    if (!validBrackets(open, c)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        return openStack.empty();
    }

    private boolean validBrackets(char open, char close) {
        return open == '(' && close == ')' ||
                open == '[' && close == ']' ||
                open == '{' && close == '}';
    }

}
