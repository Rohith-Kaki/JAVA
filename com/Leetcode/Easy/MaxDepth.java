package Leetcode.Easy;

public /**
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
class MaxDepth {
    public int maxDepth(TreeNode root) {
        int ans = height(root);
        return ans;
    }
    int height(TreeNode node){
        if(node == null) return 0;
        int leftheight = height(node.left);
        int rightheight = height(node.right);
        int ans = Math.max(leftheight, rightheight) + 1;
        return ans;
    }
} 
    
