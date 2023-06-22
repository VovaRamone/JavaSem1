package Sem5;

import java.util.Stack;

public class BracketPlacement {
    public static boolean checkBrackets(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (isOpenBracket(ch)) {
                stack.push(ch);
            } else if (isCloseBracket(ch)) {
                if (stack.isEmpty() || !isMatchingBracket(stack.pop(), ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isOpenBracket(char ch) {
        return ch == '(' || ch == '[' || ch == '{' || ch == '<';
    }

    private static boolean isCloseBracket(char ch) {
        return ch == ')' || ch == ']' || ch == '}' || ch == '>';
    }

    private static boolean isMatchingBracket(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}') ||
                (open == '<' && close == '>');
    }

    public static void test3() {
        String[] expressions = {
                "a+(d*3)",
                "[a+(1*3)",
                "[6+(3*3)]",
                "{a}[+]{(d*3)}",
                "<{a}+{(d*3)}>",
                "{a+]}{(d*3)}"};

        for (String expression : expressions) {
            boolean isValid = checkBrackets(expression);
            System.out.println(expression + " - " + isValid);
        }
    }
}
