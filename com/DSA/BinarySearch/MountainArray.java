package DSA.BinarySearch;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,100,7,6,5,3,2,1};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
       }
       public static int peakIndexInMountainArray(int[] arr) {
         int start = 0;
         int end = arr.length - 1;
         while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                //we are decreasing part of the array
                //And there is a chance that the middle element be the greatest one so we move the end to middle element and then look at left
                end = mid;
            }else{
                start = mid +1;
                //we are in incs part of the array. 
                //as we know mid is less than mid + 1 we start from mid + 1
            }
         }
            return start; // or end cox hey both are equal at last they will point t0  the last updated number by the above two checks;
        }
    }

