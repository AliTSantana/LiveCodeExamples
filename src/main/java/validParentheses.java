import java.util.Stack;

public class validParentheses {
    public static void main(String[] args){
        System.out.println(isValidParentheses("{ \"key\": [1, 2, 3 }"));
        System.out.println(isValidParentheses("{ \"key\": [1, 2, 3 ]}"));
        System.out.println(isValidParentheses("{[()]}"));
    }

    private static boolean isValidParentheses(String s) {
        if (s == null || s.isEmpty()) return true;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) return false;

                char open = stack.pop();
                if ((c == ')' && open != '(') ||
                        (c == ']' && open != '[') ||
                        (c == '}' && open != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
