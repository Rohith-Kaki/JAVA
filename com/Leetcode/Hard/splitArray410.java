package Leetcode.Hard;

public class splitArray410 {
    public static void main(String[] args) {
        
    }
    static public int splitArray(int[] nums, int k){
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++){
            start = Math.max(start, nums[i]);//will give the max induvidual element in an array.
            end += nums[i];//total sum of array
        }
        //BS
        while (start < end) {
            //Try or middle as potential answer.
            int mid = start + (end - start)/2;

            //calculate to how many pieces we can divide with the given max sum.

            int  sum =0;
            int pieces = 1; //minimum can be divided into 1 piece.
            for (int num:nums){
                if(sum + num > mid){
                    //Sum of array exceeds max value should create new array
                    //you say add this sum in new sub array then sum of new subarray(sum = new)
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }
            if(pieces > k){ //Then we should increase the max value then it reduces the pieces..
                start = mid + 1;
            }else{//if pieces <= max sum (i.e = mid value of the that [start, end] 
                //then we should increase the decrease max value to increase the no of pieces. )
                end = mid;
            }
        }
        return end; // start == end.
    }
}
