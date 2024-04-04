package LAB.LAB_3;
import java.util.*;
public class NUmberEqualityCheck{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input num1");
        int num1 = in.nextInt();
        System.out.println("Input num2");
        int num2 = in.nextInt();
        System.out.println("Input num3");
        int num3 = in.nextInt();
        System.out.println("Input num4");
        int num4 = in.nextInt();
        if(num1 == num2 && num2 == num3 && num3 == num4){
            System.out.println("Equal");
        }else{
            System.out.println(" Not Equal");
        }
    }
}