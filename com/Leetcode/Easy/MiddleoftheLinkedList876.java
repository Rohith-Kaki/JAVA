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

// you can also use fast and slow pointer approach also
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        int size = 0;
        while(current != null){
            current = current.next;
            size += 1;
        }
        if(size == 0) return null;
        ListNode middleNode = getMiddleNode(size, head);
        return middleNode;
    }
    public ListNode getMiddleNode(int size, ListNode head){
        int evensize = size-1;
        int oddsize = size-1;
        if(evensize%2==0){
            int middle = evensize/2;
            ListNode current = head;
             for(int i=0;i<middle;i++){
                current = current.next;
            }
            return current;
        }else{
            int middle = (int)Math.ceil(size/2);
            ListNode current = head;
            for(int i=0;i<middle;i++){
                current = current.next;
            }
            return current;
        }
    }
}
