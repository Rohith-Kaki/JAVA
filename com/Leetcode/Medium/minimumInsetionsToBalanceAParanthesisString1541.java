package Leetcode.Medium;
public class minimumInsetionsToBalanceAParanthesisString1541{
    public static int minInsertions(String s) {
        int f = 0;
        int l = 0;
        int i = 0;
        while(i<s.length()){
            if(s.charAt(i) == '('){
                f++;
                i++;
            }else{
                if(i+1<s.length() && s.charAt(i+1) == ')'){
                    if(f>0){
                        f--;
                    }else{
                        l++;
                    }
                    i+=2;
                }else{
                    if(f>0){
                        f--;
                        l++;
                    }else{
                        l+=2;
                    }
                    i++;
                }
            }
        }
        return l+=f*2;
    }
    public static void main(String[] args) {
        String s = "())";
        System.out.println(minInsertions(s));
    }
}