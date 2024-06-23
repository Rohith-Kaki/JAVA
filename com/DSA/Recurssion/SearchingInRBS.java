package DSA.Recurssion;

public class SearchingInRBS {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,1,2,3,4,5};
        int target = 0;
        int start = 0;
        int end = arr.length - 1;
        System.out.println(SearchRBS(arr, target, start, end));
    }
    public static int SearchRBS(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;  
        if(arr[mid] == target){
            return mid;
        }
        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target <= arr[mid]){
                // end = mid - 1;
                return SearchRBS(arr, target, start, mid - 1);
            }else{
                // start = mid + 1;
                return SearchRBS(arr, target, mid + 1, end);
            }
        }
        // if(arr[start] > arr[mid]){ "this if block can be used or need not be used, because in the above if block we checked
        // the starting element is <= middle; if that case fails obviously start is > middle"
        if(target >= arr[mid] && target <= arr[end]){
            // start = mid + 1;
            return SearchRBS(arr, target, mid + 1, end);
        }return SearchRBS(arr, target, start, mid - 1);
        // }
    }
}
