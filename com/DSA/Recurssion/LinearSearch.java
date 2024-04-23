package DSA.Recurssion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,57,6,7};
        int target = 4;
        int index = 0;
        System.out.println(Search1(arr, target, index));
    }//return boolean value.
    public static boolean Search(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }else{
            return arr[index] == target || Search(arr, target, index+1);
        }
    }//return index value
    public static int Search1(int arr[], int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return Search1(arr, target, index+1);
        }
    }
}
