package Leetcode.Easy;

import javax.swing.tree.TreeNode;

public class PathExistsInBinaryTreeFromRootToLeaf {
    private boolean findPath(int[] path, TreeNode root){
        if(root == null) return path.length == 0;
        helper(path, root, 0);
    }
    private boolean helper(int[] path, TreeNode root, int i){
        if(root == null) return false;
        if(i>=path.length || root.val != path[i]) return false;
        //leaf node check 
        if(root.left != null && root.right != null && i == path.length - 1) return true;
        left = helper(path, root.left,i+1);
        right = helper(path, root.right, i+1);
        return left || right;
    }
}
