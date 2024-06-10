package Leetcode.Easy;
import java.util.Arrays;

public class heighChecker1051 {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        int [] sorted =  heights.clone();
        Arrays.sort(sorted);
        System.out.println(Arrays.toString(sorted));
        int unmatch = 0;
        for(int i = 0; i < sorted.length; i++){
            if(sorted[i] != heights[i]){
                unmatch ++;
            }
        }
        System.out.println(unmatch);
     }
}
