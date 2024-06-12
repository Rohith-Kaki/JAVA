package DSA.BinarySearch.BS_in2D_Arrays;

import java.util.Arrays;

public class SortedRowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
        };
        int target = 4;
        System.out.println(Arrays.toString(Search(matrix, target)));
    }
    public static int[] Search(int[][] matrix, int target){
        int r = 0;
        int c = matrix[0].length -1;
        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }
            if(matrix[r][c] > target){
                c--;
            }else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
