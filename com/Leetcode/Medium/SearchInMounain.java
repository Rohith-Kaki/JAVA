package Leetcode.Medium;

public class SearchInMounain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,70,60,50,30,20,10};
        int target = 200;
        int ans = Search(arr, target);
        System.out.println(ans);
    }
    static int Search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = BS(arr, target, 0, peak);  //ifelse wont work here because it maight be in any side of the array.
        if(firstTry != -1){
            return firstTry;
        }
        return BS(arr, target, peak + 1, arr.length - 1);

    }    
    public static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    public static int BS(int[] arr, int target, int start, int end){
        boolean isasc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isasc){
                if(target > arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid = 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
} 

