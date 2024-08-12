package Leetcode.Easy;

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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            boolean ansx = false;
            boolean ansy = false;
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode current = q.poll();
                if (current.left != null && current.right != null) {
                    if ((current.left.val == x && current.right.val == y) ||
                        (current.left.val == y && current.right.val == x)) {
                        return false;
                    }
                }
                if(current.left != null){
                    q.offer(current.left);
                    if(current.left.val == x) ansx = true;
                    if(current.left.val == y) ansy = true;
                }if(current.right != null){
                    q.offer(current.right);
                    if(current.right.val == x) ansx = true;
                    if(current.right.val == y) ansy = true;
                }
            }
            if(ansx && ansy) return true;
            
            if(ansx || ansy) return  false;
        }
        return false;
    }
}