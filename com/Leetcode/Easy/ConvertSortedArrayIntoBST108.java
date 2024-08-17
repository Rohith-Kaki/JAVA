package Leetcode.Easy;

import javax.swing.tree.TreeNode;

public class ConvertSortedArrayIntoBST108 {
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        return populateSortedArray(nums, 0, nums.length);
    }
    public TreeNode populateSortedArray(int[] nums, int start, int end){
        if(start >= end) return null;
        int mid = start + (end - start)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = populateSortedArray(nums, start, mid);
        node.right = populateSortedArray(nums, mid+1, end);
        return node;
    }

}
}
