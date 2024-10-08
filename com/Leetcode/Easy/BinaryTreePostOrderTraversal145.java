package Leetcode.Easy;

import java.util.LinkedList;
import java.util.List;

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
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        helper(res, root);
        return res;
    }
    public TreeNode helper(List<Integer> res,TreeNode node){
        if(node == null) return null;
        node.left = helper(res, node.left);
        node.right = helper(res, node.right);
        res.add(node.val);
        return node;
    }
} {
    
}
