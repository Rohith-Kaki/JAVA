package Leetcode.Easy;
public class BinaryTreePreOrderTraversal144 {
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, ans);
        return ans;
    }
    private TreeNode helper(TreeNode node, List<Integer> ans){
        if(node == null) return null;
        ans.add(node.val);
        helper(node.left, ans);
        helper(node.right, ans);
        return node;
    }
}
}
