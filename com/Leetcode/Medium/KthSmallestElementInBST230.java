package Leetcode.Medium;


import java.util.LinkedList;
import java.util.Queue;


public class KthSmallestElementInBST230 {
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
    Queue<TreeNode> q = new LinkedList<>();
    public int kthSmallest(TreeNode root, int k) {
        InOrder(root);
        for(int i=0;i<k-1;i++){
            q.poll();
        }
        TreeNode ans = q.poll();
        return ans.val;
    }
    TreeNode InOrder(TreeNode node){
        if(node == null) return null;
        TreeNode left = InOrder(node.left);
        q.offer(node);
        TreeNode right = InOrder(node.right);
        return node;
    }
}
}
