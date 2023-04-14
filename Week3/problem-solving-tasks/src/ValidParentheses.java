import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        System.out.println(isValid("()")); // true
        System.out.println(isValid("()[]{}")); // true
        System.out.println(isValid("([)]")); // false    }

    }
    public static boolean isValid(String s) {
        // Stack to one by one character
        Stack<Character> stack = new Stack<>();
        // Loop for each character of the string
        for (char c : s.toCharArray()) {
            // If left symbol is encountered
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // If right symbol is encountered
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
            // If none of the valid symbols is encountered
            else {
                return false;
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}