package LAB.LAB_5;

public class FloatingPointAdjacentToPositiveAndNegativeInfinity{
    public static void main(String[] args) {
        double dn = 0.2d;
        System.out.println("\nInitial double number: " + dn);
        double next_down_dn = Math.nextDown(dn);
        double next_up_dn = Math.nextUp(dn);
        System.out.println("Double " + dn + " next down is " + next_down_dn);
        System.out.println("Double " + dn + " next up is " + next_up_dn);
    }
}