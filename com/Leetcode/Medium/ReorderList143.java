package Leetcode.Medium;

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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode head1 = head;
        ListNode middle = middle(head); 
        ListNode head2 = reversal(middle);
        while(head1 != null && head2 != null){
            ListNode temp1 = head1.next;
            head1.next = head2;
            head1 = temp1;
            ListNode temp2 = head2.next;
            head2.next = head1;
            head2 = temp2;
        }
        if(head1 != null) head1.next = null;
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
    public ListNode reversal(ListNode head){
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while(current!= null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}