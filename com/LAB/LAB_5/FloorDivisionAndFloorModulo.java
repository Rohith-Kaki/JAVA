package LAB.LAB_5;

public class FloorDivisionAndFloorModulo {
    public static void main(String[] args) {
        int dividend = 7;
        int divisor = 4;
        int floorDivision = Math.floorDiv(dividend, divisor);
        // int r = x / y;
        //if the signs are different and modulo not zero, round down
        // if ((x ^ y) < 0 && (r * y != x)) {
        //     r--;
        // }
        // return r;
        System.out.println("Floor division: " + floorDivision);
        int floorModulus = Math.floorMod(dividend, divisor);
        //     int mod = x % y;
        //     // if the signs are different and modulo not zero, adjust result
        //     if ((mod ^ y) < 0 && mod != 0) {
        //         mod += y;
        //     }
        //     return mod;
        // }
        System.out.println("Floor modulus: " + floorModulus);
    }
}