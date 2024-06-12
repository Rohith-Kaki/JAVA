package DSA.Recurssion;
import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("enter a number:");
    int num = scan.nextInt();
    System.out.println(DigitsSum(num));
    }
    public static int DigitsSum(int num){
        //to get no of digits in a number;
        int digits = (int)(Math.log10(num)) + 1;
        return helper(num, digits);
    }
    public static int helper(int num, int digits){
        if(num%10 == num){
            return num;
        }
        int rem = num % 10;
        return rem * (int)(Math.pow(10, digits - 1))+ helper( num /10, digits-1);
    }
}
