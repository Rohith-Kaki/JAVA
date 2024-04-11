package LAB.LAB_1;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        //write a java programme which accepts four int the users and prints equal if all four are equal or not.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four integers:");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        if (num1 == num2 && num2 == num3 && num3 == num4) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        scanner.close();
    }
}

