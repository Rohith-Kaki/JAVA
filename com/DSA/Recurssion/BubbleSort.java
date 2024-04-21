package DSA.Recurssion;

import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        BubbleSort1(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));   
    }
    public static void BubbleSort1(int[] arr, int r, int c){
        if(r==0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }BubbleSort1(arr, r, c+1);
        }else{
            BubbleSort1(arr, r-1, 0);
        }
    }
}
