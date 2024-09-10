package Leetcode.Medium;
public class SpiralMatrixII59 {
    class Solution {
        public int[][] generateMatrix(int n) {
            int rows = n;
            int cols = n;
            int num = 0;
            int left = 0, top = 0, right = n-1, bottom = n-1;
            int [][] ans = new int[n][n];
            while(top <= bottom && left <= right && num <= n*n){
                for(int i=left;i<=right;++i){
                    ans[top][i] = ++num;
                }
                top++;
                for(int i=top;i<=bottom;++i){
                    ans[i][right] = ++num;
                }
                right--;
                if(top<=bottom){
                    for(int i=right;i>=left;--i){
                        ans[bottom][i] = ++num;
                    }
                    bottom--;
                }
                if(left<=right){
                    for(int i=bottom; i>=top; --i){
                        ans[i][left] = ++num;
                    }
                    left++;
                }
            }
            return ans;
        }
    }
}
