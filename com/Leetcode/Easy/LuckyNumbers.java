package Leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbers {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        int rows = matrix.length;
        List<Integer> luckyNumbers = new ArrayList<>();
        int cols = matrix[0].length;
        List<Integer> rowMin = new ArrayList<>();
        // List<Integer> colMax = new ArrayList<>();
        for(int row=0;row<rows;row++){
            int min = matrix[row][0];
            for(int col=1;col<cols;col++){
                if(min>matrix[row][col]){
                    min = matrix[row][col];
                }
            }
            rowMin.add(min);
        }
        for(int col=0;col<cols;col++){
            int max = matrix[0][col];
            for(int row=0;row<rows;row++){
                if(max<matrix[row][col]){
                    max = matrix[row][col];
                }
            }
            if(rowMin.contains(max)) luckyNumbers.add(max);//just check here if that 
            // numbers already present in rowMin list.
        }
        // '''lucky numbers are the numbers which are common in both rowMin and colMax as you now this 
        // you need to make mutiple loops for checking. Just check while getting 
        // ColMAX element and see if it is present in the rowMin List or not'''
        
        // for(int i=0;i<rowMin.size();i++){
        //     for(int j=0;j<colMax.size();j++){
        //         if(rowMin.get(i).equals(colMax.get(j))){
        //             luckyNumbers.add(rowMin.get(i));
        //             break;
        //         }
        //     }
        // }
        return luckyNumbers;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
       System.out.println( luckyNumbers(matrix));
    }
}