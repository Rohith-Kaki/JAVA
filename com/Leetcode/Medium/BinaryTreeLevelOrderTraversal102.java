package Leetcode.Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return result;
        q.offer(root);
        while(!q.isEmpty()){
            int levelsize = q.size();
            List<Integer> currentlevel = new ArrayList<>();
            for(int i = 0; i < levelsize; i++){
                TreeNode current = q.poll();
                currentlevel.add(current.val);
                if(current.left != null){
                    q.offer(current.left);
                }if(current.right != null){
                    q.offer(current.right);
                }
            }
            result.add(currentlevel);
        }
        return result;
    }
}