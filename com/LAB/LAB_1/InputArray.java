package LAB.LAB_1;

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}
