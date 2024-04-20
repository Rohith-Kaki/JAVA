package LAB.LAB_4;

import java.util.Scanner;

public class ConvertToSquareCubeFourthPOwer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter Number:");
        float Number = scan.nextFloat();
        System.out.println(converterToSquare(Number));
        System.out.println(converterToCube(Number));
        System.out.println(converterToFourthPower(Number));
        scan.close();
    }
    public static float converterToSquare(float Number){
        float Number_square = (float) Math.pow(Number, 2);
        return Number_square;
    }
    public static float converterToCube(float Number){
        float Number_cube = (float) Math.pow(Number, 3);
        return Number_cube;
    }
    public static float converterToFourthPower(float Number){
        float Number_fourthpower = (float) Math.pow(Number, 4);
        return Number_fourthpower;
    }
}
