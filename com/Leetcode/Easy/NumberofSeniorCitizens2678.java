public class NumberofSeniorCitizens2678 {
    class Solution {
        public int countSeniors(String[] details) {
            int count = 0;
            for(String s: details){
                int tens = s.charAt(11)-'0';
                int ones = s.charAt(12)-'0';
                int age = tens*10 + ones;
                if(age>60) count++;
            }
            return count;
        }
    }
}
