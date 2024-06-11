package DSA.BinarySearch;

public class LeastIndexInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {74, 47, 40, 10, 0, 20, 44,77};
        int ans = Search(arr);
        System.out.println(ans);
    }
    public static int Search(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid-1]){
                start = mid;
            }else{
                end = mid - 1;
            }
        }
        return end;
    }
    }

