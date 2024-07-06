package Programs;
import java.util.Arrays;

public class ArrayReversing{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 9, 11, 47};
        reverse(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr, int start, int end){
            while (start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }
