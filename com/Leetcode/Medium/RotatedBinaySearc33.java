package Leetcode.Medium;

public class RotatedBinaySearc33 {
    public static void main(String[] args) {
        int[] arr = {6,6,7,0,7,6};
        int target = 7;
        System.out.println(Search(arr, target));
    }
    static int Search(int[] arr, int target){
        int pivot = FindPivotWithDuplicates(arr);
        if(pivot == -1){ //Array is not sorted and its solved by binary search.
            return BS(arr, target, 0, arr.length - 1);
        }
        //if pivot is found ur found two ascending sorted arrays.
        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){ //target > start {target = 6} then we know that 
        //all the elenents after the pivot are less than start so search space is reduced to (start to pivot -1)
        return BS(arr, target, 0, pivot - 1); //pivot is index returned.
        }
        return BS(arr, target, pivot + 1, arr.length -1);   //if target < start (t = 1) then all the elements
        //towards the left side of the pivot will be greater.
        //soo search space reduces to (pivot + 1 to end of array)
    }
    //Binary Search......
    static int BS(int[] arr, int target, int start, int end){
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
        return -1;
    }

    //to find pivot.....
    static int FindPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;//pivot will be mid as the mid +1 is less than mid.  mid<end coz it should move forward to avoid index out of range.
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1; //pivot will be mid - 1 as the mid -1 is greater than mid.  mid > end so that it can move backward coz m-1
           }
           //if start end and middle elements are equal then just skip the duplicates.
           if(arr[start] == arr[mid] && arr[end] == arr[mid]){
            //Note:what if start and stop are the pivots.
            //check if start is pivot.
            if(arr[start] < arr[start + 1]){
                return start;
            }
            start++;
            //Check if end is pivot
            if(arr[end]<arr[end-1]){
                return end - 1;
            }
            end--;
           }
           //left side is sorted so pivot is in the right side..
           else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end]<arr[mid])){
            //now check right hand side
            start = mid + 1;
           }else{
            end = mid - 1;
           }


        }
        return -1;
    }
}

