import java.util.Arrays;

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int ans  = 0;
        for(int i=0;i<seats.length;i++){
            ans += Math.abs(seats[i] - students[i]);
        }
        return ans;
    }
}

public class MinimumNumberofMovestoSeatEveryone2037 {
    public static void main(String[] args) {
        int [] seats = {3,4,5,2,1};
        int [] students = {4,5,2,5,3};
        CycleDetection one = new CycleDetection();
        System.out.println(one.minMovesToSeat(seats,students));
    }
}
