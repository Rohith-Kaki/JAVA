package LAB.LAB_4;

import java.math.BigInteger;

public class PrimitiveValueFromBigInteger {
    public static void main(String[] args) {
        BigInteger bi = new BigInteger("12345678901234567890");
        int signum = bi.signum();
        long longValue = bi.longValue();
        float floatValue = bi.floatValue();
        double doubleValue = bi.doubleValue();

        System.out.println("BigInteger value: " + bi);
        System.out.println("Signum value: " + signum);
        System.out.println("Long value: " + longValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);
    }
}