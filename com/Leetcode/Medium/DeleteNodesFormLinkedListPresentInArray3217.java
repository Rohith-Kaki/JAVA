package Leetcode.Medium;

import java.util.HashSet;
import java.util.Set;

public class DeleteNodesFormLinkedListPresentInArray3217 {
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        if(nums.length == 0 || head == null) return null;
        Set<Integer> numset = new HashSet<>();
        for(int num:nums){
            numset.add(num);
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;
        while(current != null){
            if(numset.contains(current.val)){
                prev.next = current.next;
            }else{
                prev = current;
            }
            current = current.next;
        }
        return dummy.next;
    }
}
}
