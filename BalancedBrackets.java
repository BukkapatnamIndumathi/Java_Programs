package Patterns;


import java.util.Stack;

public class BalancedBrackets {

    public static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '[' || ch == '(' || ch == '{') {
                st.push(ch);
            } 
            else if (ch == ']' || ch == ')' || ch == '}') {

                if (st.isEmpty()) {
                    return false;
                }

                char top = st.peek();

                if ((ch == ']' && top != '[') ||
                    (ch == ')' && top != '(') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }

                st.pop();
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {

        
        String s = "[]{}";

        System.out.println(isBalanced(s) ? "Valid" : "Invalid");
    }
}
