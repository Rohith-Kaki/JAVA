package Leetcode.Medium;

class Solution {
    public int minIncrementForUnique(int[] nums) {
        int max = nums[0];
        for(int num:nums){
            max = Math.max(max,num);
        }
        int[] freq = new int[max + nums.length];
        for(int num:nums){
            freq[num]++;
        }
        int ans = 0;
        for(int i = 0; i<freq.length; i++){
            if(freq[i] <= 1) continue;
            int duplicates = freq[i] -1;
            freq[i+1] += duplicates;
            ans += duplicates;
        }
        return ans;
    }
}
public class MinimumIncrementToMakeArrayUnique945 {
    public static void main(String[] args) {
        Solution one = new Solution();
        int[] nums = {2,3,2,3,3,3};
        int result = one.minIncrementForUnique(nums);
        System.out.println(result);
    }
}