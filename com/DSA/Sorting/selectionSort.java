package DSA.Sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {-2,1,-34,54};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void SelectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int Max = 0;
            for(int j = 0; j < arr.length - i; j++){
                if(arr[j] > arr[Max]){
                  Max = j;
                }
            }
            int temp = arr[arr.length - (i+1)];
            arr[arr.length - (i+1)] = arr[Max];
            arr[Max] = temp ;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               

        }
    }
}