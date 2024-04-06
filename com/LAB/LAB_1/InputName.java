package LAB.LAB_1;

import java.util.Scanner;

public class InputName {
    public static void main(String[] args){ 
        Scanner in = new Scanner(System.in);
        System.out.println("enter your name");
        String name = in.next();
        System.out.println("Hello"+" "+name);

    }
}
