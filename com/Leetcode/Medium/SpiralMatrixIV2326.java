package Leetcode.Medium;
public class SpiralMatrixIV2326 {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans = new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j] = -1;
            }
        }
        int top = 0, left = 0, right = n-1, bottom = m-1;
        ListNode current = head;
        while(current != null && top <= bottom && left <= right){
            for(int i=left ; i <= right && current != null; i++){
                ans[top][i] = current.val;
                current = current.next;
            }
            top++;
            for(int i=top; i<=bottom && current != null; i++){
                ans[i][right] = current.val;
                current = current.next;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left && current != null; i--){
                    ans[bottom][i] = current.val;
                    current = current.next;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top && current != null; i--){
                    ans[i][left] = current.val;
                    current = current.next;
                }
                left++;
            }
        }
        return ans;
    }
}
}
