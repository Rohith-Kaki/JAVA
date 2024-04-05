package LAB.LAB_3;
import java.lang.Math;
public class PowerOfNumbers {
    public static void main(String[] args) {
        for(int i=0; i<19; i++){
            System.out.println((int)(4*(Math.pow(2, (i-1)))));
        }
    }
}
