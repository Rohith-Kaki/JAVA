package DSA.BinarySearch;

public class RBSCount2 {
    public static void main(String[] args) {
            int[] arr = {2,2,2,3,4,2};
            System.out.println(Rotations(arr));;
            
    }
    //count no of rotations adfter pivot is returned.
    public static int Rotations(int[] arr){
        int pivot = FindPivotWithDuplicates(arr);  //NO need if statment because if it is not sorted array then it returns -1, pivot = -1
        return pivot + 1;// -1+1 =0 no of rotations = 0;
    }
    
// OR we can also say no of rotations by finding pivot index + 1
//for no duplicate arrays 
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
    //if array is with suplicates then use this function.....
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

