package Leetcode.Easy;

import java.util.HashMap;

public class NthTribonacciNumber1137 {
    class Solution {
    public int tribonacci(int n) {
        return helper(n, new HashMap<>());
    }
    public int helper(int n , HashMap<Integer, Integer> memo){
        if(n == 0 || n == 1) return n;
        if(n == 2) return 1;
        if(memo.containsKey(n)) return memo.get(n);
        int res = helper(n-1, memo)+ helper(n-2, memo) + helper(n-3, memo);
        memo.put(n, res);
        return res;
    }
}
}
