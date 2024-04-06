package LAB.LAB_5;
//3.	Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
import java.util.Scanner;
public class AddAllDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number:");
        int num = scan.nextInt();
        int Result = DigitsSum(num);
        System.out.println("Result"+ " " + Result);
        scan.close();
    }
        public static int DigitsSum(int num){
            if (num == 0){
                return 0;
            }
            return DigitsSum(num / 10) + (num % 10);
        }  
}

