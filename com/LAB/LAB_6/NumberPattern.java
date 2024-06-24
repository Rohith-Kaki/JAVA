package LAB.LAB_6;
public class NumberPattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print("  ");
            }
            int num = i;
            for (int k = 1; k <= i; k++) {
                System.out.print(num + " ");
                num++;
            }
            num -= 2;
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(num + " ");
                num--;
            }
            System.out.println();
        }
        System.out.println("Kaki Lahari Rohith"+" "+"23WU0102103");
    }
}

