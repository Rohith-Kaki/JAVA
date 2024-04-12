package LAB.LAB_5;

import java.util.Scanner;

//2.	Write a Java program that reads a number in inches and converts it to meters.
public class InchesToMeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter inches:");
        float inches = scan.nextFloat();
        System.out.println(converter(inches));
        scan.close();
    }
    public static float converter(float inches){
        float meters = (float) (inches / 39.37);
        return meters;
    }
}
