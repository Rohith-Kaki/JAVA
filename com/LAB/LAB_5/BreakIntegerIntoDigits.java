package LAB.LAB_5;
import java.util.Scanner;

public class BreakIntegerIntoDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input six non-negative digits: ");
        int input = scanner.nextInt();

        int digit1 = input / 100000 % 10;
        int digit2 = input / 10000 % 10;
        int digit3 = input / 1000 % 10;
        int digit4 = input / 100 % 10;
        int digit5 = input / 10 % 10;
        int digit6 = input % 10;

        System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5 + " " + digit6);
        scanner.close();
    }
}
