package Leetcode.Medium;

import java.util.Arrays;

public class FirstAndLastIndex34 {
    public static void main(String[] args) {
        int[] nums = {6,7,7,7,8,8,10};
        int target = 7;
        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = Search(nums, target, true);
        int end = Search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
       }
       static int Search(int[] nums, int target, boolean FindIndex){
           int start = 0;
           int ans = -1;
           int end = nums.length - 1;
           while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                   end = mid -1;
               }else if(target > nums[mid]){
                   start = mid + 1;
               }else{
                   ans = mid;
                   if(FindIndex){
                       end = mid - 1;
                   }else{
                       start = mid + 1;
                   }
               }
           }
        return ans;
       }
   }

