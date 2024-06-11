package DSA.BinarySearch;
//reversr of mountain array.
public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {74, 47, 40, 10, 0, 20, 44,77};
        int target = 40;
        int ans = Search(arr, target);
        System.out.println(ans);
    }
    static int Search(int[] arr, int target){
        int peak = leastIndexInMountainArray(arr);
        int firstTry = BS(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return BS(arr, target, peak + 1, arr.length - 1);

    }    
    public static int leastIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid-1]){
                start = mid;
            }else{
                end = mid;
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

