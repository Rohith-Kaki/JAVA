 package DSA.Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void BubbleSort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if tou did not swap for a particular value of i, it means the array is sorted henve stop the array.
            if(!swapped){
                break;
            }
        }
    }
}