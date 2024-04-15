package LAB.LAB_4;

public class SignedAndUnsignedInt {
    public static void main(String[] args) {
        int int1 = Integer.MIN_VALUE;
        int int2 = Integer.MAX_VALUE;
        System.out.println("Signed integers: " + int1 + ", " + int2);
        int compare_Signed_num = Integer.compare(int1, int2);
        System.out.println("Result of comparing signed numbers: " + compare_Signed_num);
        int compare_Unsigned_num = Integer.compareUnsigned(int1, int2);
        System.out.println("Result of comparing unsigned numbers: " + compare_Unsigned_num);
    }
}