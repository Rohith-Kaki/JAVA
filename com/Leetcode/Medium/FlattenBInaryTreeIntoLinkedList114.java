package Leetcode.Medium;

import java.util.LinkedList;
import java.util.Queue;
public class FlattenBInaryTreeIntoLinkedList114 {
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
    public void flatten(TreeNode root) {
        if(root == null) return;
        preOrder(root);
        TreeNode prev = q.poll();
        while(!q.isEmpty()){
            TreeNode current = q.poll();
            prev.left = null;
            prev.right = current;
            prev = current;
        }
        if(prev != null){
            prev.left = null;
            prev.right = null;
        }
    }
    public void preOrder(TreeNode root){
        if(root == null) return;
        q.offer(root);
        preOrder(root.left);
        preOrder(root.right);
    }
}
}
