package Leetcode.Easy;

public class RemoveLilnkedListElements203 {
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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy.next;
        ListNode prev = dummy;
        while(current != null){
            if(current.val == val) prev.next = current.next;
            else prev = current;
            current = current.next;
        }
        return dummy.next;
    }
}
}
