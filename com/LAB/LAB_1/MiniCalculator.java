package LAB.LAB_1;

import java.util.Scanner;

public class MiniCalculator {
    public static void main(String[] args) {
        //Mini Calculator
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Mini Calculator!");

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        double result = 0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return; 
                }
                break;
            default:
                System.out.println("Invalid choice!");
                return; 
        }

        System.out.println("Result: " + result);
    }
}

