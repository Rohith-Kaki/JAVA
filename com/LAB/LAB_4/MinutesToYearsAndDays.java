package LAB.LAB_4;
//4.	Write a Java program to convert minutes into years and days. 
import java.util.Scanner;

public class MinutesToYearsAndDays {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter minutes:");
        float minutes = scan.nextFloat();
        System.out.println("Minutes in years");
        System.out.println(ConverToYears(minutes));
        System.out.println("Minutes in days");
        System.out.println(ConverToDays(minutes));
        scan.close();
    }
    public static float ConverToYears(float minutes){
        float years = (float) (minutes / 525600);
        return years;
    }
    public static float ConverToDays(float minutes){
        float Days = (float) (minutes / 1440);
        return Days;
    }
}

