package LAB.LAB_2;
import java.util.Scanner;
public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number1:");
        int a = in.nextInt();
        System.out.print("Enter number2:");
        int b = in.nextInt();
        int hcf = 0;
        for(int i =1; i<=a || i<= b; i++){
            if(a%i == 0 && b%i == 0){
                hcf = i;
            }
        }
        System.out.println("HCF"+" "+hcf);

    }
}
