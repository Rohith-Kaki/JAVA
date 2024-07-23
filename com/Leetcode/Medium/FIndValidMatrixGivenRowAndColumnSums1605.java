package Leetcode.Medium;

import java.util.Arrays;

public class FIndValidMatrixGivenRowAndColumnSums1605 {
    public static int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][] matrix = new int[rowSum.length][colSum.length];
        int x =0;int y = 0;
        while(x<rowSum.length && y<colSum.length){
            matrix[x][y] = Math.min(rowSum[x],colSum[y]);
            rowSum[x]-=matrix[x][y];
            colSum[y]-=matrix[x][y];
            if(rowSum[x]==0) x++;
            else y++;
        }
        return matrix;

    }
    public static void main(String[] args) {
        int[] rowSum = {3,8};
        int[] colSum = {4,7};
        int[][] ans = restoreMatrix(rowSum, colSum);
        System.out.println(Arrays.deepToString(ans));
    }
}