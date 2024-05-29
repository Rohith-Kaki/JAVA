package DSA.BinarySearch;

public class OderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-17, -15, -10, 0, 4, 7, 47, 74};
        int target =  7;
        int ans = Search(arr, target);
        System.out.println(ans);
    }
    static int Search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
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
