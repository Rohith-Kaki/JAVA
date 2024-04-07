package LAB.LAB_5;
//6.	Write a Java program to compute the body mass index (BMI
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        double bmi = calculateBMI(weight, height);
        System.out.println("Your BMI is: " + bmi);
        scanner.close();
    }

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
}

