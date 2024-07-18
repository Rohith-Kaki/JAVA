package Leetcode.Medium;

import java.util.Arrays;

public class BoatsToSavePeople881 {
    public static void main(String[] args) {
        Solution one = new Solution();
        int[] people = {11,3,4,3,4,5,4,3};
        System.out.println(one.numRescueBoats(people, 5));

    }
}
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int boatsRequired = 0;
        while(left <= right){
            if(people[left] + people[right] <= limit){
                left++;
            }
            right--;
            boatsRequired++;
        }
        return boatsRequired;
    }
}
