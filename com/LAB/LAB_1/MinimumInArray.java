package LAB.LAB_1;

public class MinimumInArray {
    public static void main(String[] args) {
          int[] arr = {100,33, 34, 44, 78, 74};
            System.out.println(min(arr));
        }
        static int min(int[] arr){
            int minimum = Integer.MAX_VALUE;
            System.out.println(minimum);
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
