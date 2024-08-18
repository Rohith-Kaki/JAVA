package Leetcode.Medium;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class BinaryTreeZigzagLevelOrderTraversal103 {
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> q = new LinkedList<>();
        boolean LTR = true;
        if(root == null) return result;
        q.offer(root);
        while(! q.isEmpty()){
            int qsize = q.size();
            List<Integer> levelResult = new ArrayList<>();
            for(int i=0;i<qsize;i++){
                //normal order: remove front , add back..
                TreeNode current = q.poll();
                if(LTR){
                    levelResult.add(current.val);
                }else{
                    levelResult.add(0,current.val);
                }
                if(current.left != null) q.offer(current.left);
                if(current.right != null) q.offer(current.right);
            }
            result.add(levelResult);
            LTR = !LTR;
        }
        return result;
    }
}
}
