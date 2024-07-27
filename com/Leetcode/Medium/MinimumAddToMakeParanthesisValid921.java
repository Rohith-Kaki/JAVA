package Leetcode.Medium;

import java.util.Stack;

public class MinimumAddToMakeParanthesisValid921 {
    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(char c: s.toCharArray()){
            if(c == '(') stack.push(c);
            else{
                if(c == ')'){
                    if(!stack.isEmpty() && '(' == stack.peek()) stack.pop();
                    else count++;
                }
            }
        }
        if(!stack.isEmpty()) return count + stack.size();
        else return count;
    }
    public static void main(String[] args) {
        String s = "(()()";
        System.out.println(minAddToMakeValid(s));
    }
}
