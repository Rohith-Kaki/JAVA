package DSA.Recurssion;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,6,7};
        System.out.println( SortedCheck(arr, 0));
    }
    public static boolean SortedCheck(int[] arr, int index){
        if(index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index+1] && SortedCheck(arr, index+1);
    }
}
