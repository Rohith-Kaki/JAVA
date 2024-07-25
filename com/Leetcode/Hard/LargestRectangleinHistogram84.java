package Leetcode.Hard;

import java.util.Stack;

public class LargestRectangleinHistogram84 {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int max = 0;
        s.push(0);
        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[i] >heights[s.peek()]){
                max = getMax(heights,s,max,i);
            }
            s.push(i);
        }
        int i = heights.length;
        while(!s.isEmpty()){
            max = getMax(heights,s,max,i);
        }
        return max;
    }
    private static int getMax(int[] heights, Stack<Integer> s, int max, int i){
        int area;
        int popped = s.pop();
        if(s.isEmpty()){
            area = heights[popped]*i;
        }else{
            area = heights[popped]*(i-1-s.peek())
        }
        return Math.max(area, max);
    }
}
