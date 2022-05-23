import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>(); 
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (letter == '(' || letter == '[' || letter == '{') {
                stack.push(letter);
            }
            else {
                if (stack.empty())
                    return false;
                char bracket = stack.pop();
                
                if (bracket == '(' && letter != ')') {
                    return false;
                }
                else if (bracket == '[' && letter != ']') {
                    return false;
                }
                else if (bracket == '{' && letter != '}') {
                    return false;
                }
            }
        }
        if (!stack.empty())
            return false;
        return true;
    }
}
