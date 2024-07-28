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
    public boolean isPalindrome(ListNode head) {
     ListNode middle = middle(head);
     ListNode aftermiddle = reversal(middle);
     ListNode rereversal = aftermiddle;
     //comparing both half
     while(head != null && aftermiddle != null){
        if(head.val != aftermiddle.val){
            break;
        }
        head = head.next;
        aftermiddle = aftermiddle.next;
     }
     //reversal the second to normal again;
     reversal(rereversal);
     return head == null || aftermiddle == null;
    }
    public ListNode middle(ListNode head){
       ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode reversal(ListNode middle){
        ListNode prev = null;
        ListNode current = middle;
        ListNode next = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
