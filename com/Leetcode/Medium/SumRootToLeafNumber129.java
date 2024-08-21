package Leetcode.Medium;


public class SumRootToLeafNumber129 {
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
    int sumAllPaths = 0;
    public int sumNumbers(TreeNode root) {
        String sum = "0";
        pathsum(root,sum);
        return sumAllPaths;
    }
    public TreeNode pathsum(TreeNode root, String sum){
        if(root == null) return null;
        String rootval = Integer.toString(root.val);
        if(root.left == null && root.right == null){
            sum += rootval;
            sumAllPaths += Integer.parseInt(sum);
            return root;
        }
        TreeNode left = pathsum(root.left, sum+rootval);
        TreeNode right = pathsum(root.right, sum+rootval);
        return root;
    }
}
}
