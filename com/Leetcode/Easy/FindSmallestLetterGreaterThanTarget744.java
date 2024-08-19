package Leetcode.Easy;

public class FindSmallestLetterGreaterThanTarget744 {
    public static void main(String[] args) {
        int[] arr = {-17, -15, -10, -4, 0, 4, 7, 74};
        int target = 155;
        int ans = Ceil(arr, target);
        System.out.println(ans);
        }
    static int Ceil(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        //if target element  is greater than the biggest element in the array.
        if(target > arr[arr.length - 1]){
            return -1;
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }else if(target<arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
