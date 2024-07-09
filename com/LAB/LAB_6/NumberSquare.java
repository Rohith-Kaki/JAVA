package LAB.LAB_6;
public class NumberSquare{
    public static void main(String[] args) {
        int n = 5;
        int k = 0;
        int r = 1;
        for(int i=1;i<=n;i++){
            k=i;
            r=1;
            for(int j=(n+1)-i;j>=1;j--){
                System.out.print(k++);
            }
            for(int j=2;j<=i;j++){
                System.out.print(r++);
            }
        System.out.println();
        }
    }
}