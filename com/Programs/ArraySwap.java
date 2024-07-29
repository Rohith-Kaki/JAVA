package Programs;

import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
     int[] arr = {1,4,5,6,18};
     swap(arr ,0 ,arr.length-1);   
     System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
