package LAB.LAB_6;

public class ArraySum {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int sum = sumArray(myArray);
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Kaki Lahari Rohith"+" "+"23WU0102103");
    }
    
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }
}
