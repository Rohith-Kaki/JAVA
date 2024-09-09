/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class CycleDetection {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode f = head;
        ListNode s = head;
        while(f != null && f.next != null){
            f = f.next.next;
            s = s.next;
            if(s == f) break;
        }
        if(s!=f) return null;
        s = head;
        f = f;
        while(s != f){
            s = s.next;
            f = f.next;
        }
        return s;
    }
}