
// public class Evendigits {
//     public static void main(String[] args) {
//         int[] nums = {1221212122};
//         int ans = FindNumbers(nums);
//         System.out.println(ans);
//     }
//     public static int FindNumbers(int[] nums){
//         int count = 0;
//         for (int i = 0; i < nums.length; i++){
//             if(EvenNo(nums[i]) % 2 ==0){
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static int EvenNo(int i){
//         int n = i;
//         int digitCount = 0;
//         while (n>0) {
//            int r = n%10;
//             digitCount++;
//             n = n/10;
//         }
//         return digitCount;
//     }
// }
public class Evendigits {
    public static void main(String[] args) {
        int[] nums = {1322,32 ,4444, 5585,7, 74};
        int ans = FindNUmbers(nums);
        System.out.println(ans);
    }
    public static int FindNUmbers(int[] nums){
    int count = 0;
    for(int num:nums){
        if((int)(Math.log10(num))%2 == 1){
            count++;
        }
    }
    return count;
}
}