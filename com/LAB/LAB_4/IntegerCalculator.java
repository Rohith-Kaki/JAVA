package LAB.LAB_4;
//9.Write a Java program that accepts two integers from the user and prints the sum, the difference, the product, the average, the distance (the difference between the integers), the maximum (the largest of the two integers), and the minimum (the smallest of the two integers). 
import java.util.Scanner;

public class IntegerCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int firstInt = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int secondInt = scanner.nextInt();

        // Calculations
        int sum = firstInt + secondInt;
        int difference = firstInt - secondInt;
        int product = firstInt * secondInt;
        double average = (int) (firstInt + secondInt) / 2; 
        int distance = Math.abs(difference); 
        int max = Math.max(firstInt, secondInt);
        int min = Math.min(firstInt, secondInt);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Average:" + average);
        System.out.println("distance:" + distance);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        scanner.close();
    }
}

