package DSA.BinarySearch.BS_in2D_Arrays;
import java.util.Arrays;
public class Sorted2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
            };
        int target = 4;
        System.out.println(Arrays.toString(Search(matrix, target)));
        }
    static int[] BS(int[][] matrix, int row, int Cstart, int Cend, int target){
        while(Cstart <= Cend){
            int mid = Cstart + (Cend - Cstart) / 2;
            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if(matrix[row][mid] < target){
                Cstart = mid + 1;
            }else{
                Cend = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] Search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length; //matrix may be empty.
        if(rows == 1){
            return BS(matrix, 0, 0, cols-1, target);
        }
        int rStart = 0;
        int rEnd = matrix.length - 1; //row -1
        int cMid = cols/2;
        while (rStart < (rEnd - 1)) { //if this is true we will have more than two rows.
            int mid = rStart + (rEnd -rStart) / 2;
            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            if(matrix[mid][cMid] < target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
         }
        //run the loop till tow rows are remaining (we are elemininating the rows.)
        //check wether the target is in col of two rows.
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if(matrix[rStart + 1][cMid] == target){
            return new int[]{rStart + 1, cMid};
        }
        //Search in 1st half
        if(target <= matrix[rStart][cMid - 1]){
            return BS(matrix, rStart, 0, cMid - 1, target);
        } 
        //2nd half
        if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols-1]){
            return BS(matrix, rStart, cMid, cols-1, target);
        }
        //3rd half
        if(target <= matrix[rStart+1][cMid-1]){
            return BS(matrix, rStart+1, 0, cMid-1, target);
        }else{
            return BS(matrix, rStart, cMid + 1, cols-1, target);
        }
    }
}
