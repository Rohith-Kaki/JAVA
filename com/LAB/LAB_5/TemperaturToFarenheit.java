package LAB.LAB_5;
import java.util.Scanner;
//1.	Write a Java program to convert temperature from Fahrenheit to Celsius degrees. 

public class TemperaturToFarenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter temperature in celsius:");
        float temperature = scan.nextFloat();
        System.out.println(converter(temperature));
        scan.close();
    }
    public static float converter(float temperature){
        float Fahrenheit = (temperature * 9/5) + 32;
        return Fahrenheit;
    }
}
