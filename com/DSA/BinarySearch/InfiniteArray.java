package DSA.BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 12, 13, 144, 156, 177, 198, 330, 440, 560, 700, 760, 1000, 2000, 3000, 4000};
        int target = 198;
        System.out.println(Search(arr, target));
    }
    public static int Search(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int newStart = end + 1 ;
            //doubling the chunk size if the target element is greater than the last element in the chunk.
            //end + boxsize * 2 => boxsize = (end - start + 1) it gives the size of pervious chunk
            end = end + (end - start + 1)*2;
            start = newStart;
        }
        return BinarySearch(arr, target, start, end);
    }
    public static int BinarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
