package LAB.LAB_6;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        double average = calculateAverage(numbers);
        System.out.println("Average: " + average);
        System.out.println("Kaki Lahari Rohith"+" "+"23WU0102103");
        scanner.close();
    }
    public static double calculateAverage(int[] numbers) {
        double total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total / numbers.length;
    }
}
