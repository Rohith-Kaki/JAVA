package LAB.LAB_2;

public class NumberPyramid {
    public static void main(String[] args) {
        int n= 4;
        int k = 1;
        for(int i = 1; i<=n ;i++){
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            k = i;
            for(int j=1;j<=i;j++){
                System.out.print(k++);
            }
            k = k-2;
            for(int j =1;j<i;j++){
                System.out.print(k--);
            }
            System.err.println();
            
        }
    }
}
