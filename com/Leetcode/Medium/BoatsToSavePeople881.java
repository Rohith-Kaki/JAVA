package Leetcode.Medium;

import java.util.Arrays;

public class BoatsToSavePeople881 {
    public static void main(String[] args) {
        
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
