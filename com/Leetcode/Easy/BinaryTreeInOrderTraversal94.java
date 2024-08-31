package Leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInOrderTraversal94 {
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }
    private TreeNode helper(TreeNode root, List<Integer> res){
        if(root == null) return null;
        helper(root.left, res);
        res.add(root.val);
        helper(root.right, res);
        return root;
    }
}
}
