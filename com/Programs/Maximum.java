package Programs;

public class Maximum {
    public static void main(String[] args) {
        int[] arr = {100,33, 34, 44, 78, 74};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maximum = 0;
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
}
