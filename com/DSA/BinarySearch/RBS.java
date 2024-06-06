package DSA.BinarySearch;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 5;
        System.out.println(Search(arr, target));
    }
    static int Search(int[] arr, int target){
        int pivot = FindPivot(arr);
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
    static int FindPivot(int[] arr){
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
           if(arr[start] >= arr[mid]){
            end = mid - 1;
           }else{
           start = mid + 1; //itt is not startt because if it is only start it will be found in the first two cases itself.
           }
        }
        return -1;
    }
}
