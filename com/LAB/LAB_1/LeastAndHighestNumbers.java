package LAB.LAB_1;

import java.util.Arrays;

public class LeastAndHighestNumbers {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        System.out.println(min(arr));
        System.out.println(max(arr));
        System.out.println(Arrays.toString(arr));
        
    }
    public static int max(int[] arr){
        int maximum = Integer.MIN_VALUE;
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] > maximum){
            maximum = arr[i];
           }
        }
        return maximum;
    }
    public static int min(int[] arr){
        int minimum = Integer.MAX_VALUE;
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] < minimum){
            minimum= arr[i];
           }
        }
        return minimum;
    }   
}
