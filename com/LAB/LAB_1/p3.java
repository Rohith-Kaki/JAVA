package LAB.LAB_1;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        //WAP that accepts two double variables and test if both are strictly between 0 and 1 or false  other wise.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two double variables:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        boolean result = (num1 > 0 && num1 < 1) && (num2 > 0 && num2 < 1);
        System.out.println(result);
        scanner.close();
    }
}
