package Leetcode.Easy;
import java.util.Stack;
public class ValidParanthesis20 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '{' || c =='[' || c =='('){
                stack.push(c);
            }else{
                if(c == '}'){
                    if(!stack.isEmpty() && '{' == stack.peek()) stack.pop();
                    else return false;
                }
                if(c == ']'){
                    if(!stack.isEmpty() && '[' == stack.peek()) stack.pop();
                    else return false;
                }
                if(c == ')'){
                    if(!stack.isEmpty() && '(' == stack.peek()) stack.pop();
                    else return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "(]";
        System.out.println(isValid(s));
    }
}
