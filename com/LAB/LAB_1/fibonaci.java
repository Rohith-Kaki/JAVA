package LAB.LAB_1;

public class fibonaci{
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int a = in.nextInt();
        int a = 0;
        int b = 1;
        int n = 1;
        System.out.print(0 + " ");
        System.out.print(1 + " ");


        while(n<=10){
        int c = a + b;
        System.out.print(c + " ");
        a = b;
        b = c;
        n++;
        }


       
    }
}
