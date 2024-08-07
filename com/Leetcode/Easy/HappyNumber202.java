class Solution {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do{
            fast = squares(squares(fast));
            slow = squares(slow);
        }while(fast != slow);
        if(slow == 1){
            return true;
        }
        return false;
    }
    public int squares(int n){
        int ans = 0;
        while(n>0){
            int digit = n%10;
            ans += digit * digit;
            n = n/10;
        }
        return ans;
    }
}