package Leetcode.Easy;
import java.util.Arrays;

public class MissingNumber268 {
    public static void main(String[] args) {
        int[] nums = {3,1,0};
        Solution one = new Solution();
        System.out.println(one.missingNumber(nums));
    }
    
}
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(nums[0] !=0) return 0;
        if(nums[n-1] != n) return n;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i) return i;
        } 
        return 0;
    }
}