package Leetcode.Easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.swing.tree.TreeNode;

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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return result;
        q.offer(root);
        while(!q.isEmpty()){
            int levelsize = q.size();
            double sum = 0;
            for(int i=0;i<levelsize;i++){
                TreeNode current = q.poll();
                sum += current.val;
                if(current.left != null) q.offer(current.left);
                if(current.right != null) q.offer(current.right);
            }
            result.add(sum/levelsize);
        }
        return result;
    }
}
