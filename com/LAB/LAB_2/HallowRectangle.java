package LAB.LAB_2;

public class HallowRectangle {
    public static void main(String[] args) {
        //no of rows and colomns
        int n = 4;
        int m = 4;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(i ==0 || j==0 || i== n-1 || j == m-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
