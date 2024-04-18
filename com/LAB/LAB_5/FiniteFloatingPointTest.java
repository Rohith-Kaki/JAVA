package LAB.LAB_5;

public class FiniteFloatingPointTest {
    public static void main(String[] args) {
        double num1 = Double.POSITIVE_INFINITY;
        double num2 = Double.NaN;

        System.out.println(num1 + " is finite: " + isFinite(num1));
        System.out.println(num2 + " is finite: " + isFinite(num2));
    }

    public static boolean isFinite(double num) {
        return !Double.isInfinite(num) && !Double.isNaN(num);
    }
}
