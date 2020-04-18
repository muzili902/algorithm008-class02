public class Leetcode_20_ValidParentheses{

    public boolean isValid(String s) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (c=='('||
                    c=='['||
                    c=='{'
            ) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char left = stack.pop();
                    if (left == '(' && c != ')') return false;
                    if (left == '[' && c != ']') return false;
                    if (left == '{' && c != '}') return false;
                }
            }
        }

        return stack.isEmpty();

    }
}