package Leetcode.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class NoOfPathInBinaryTreeEqualToSum {
    public int countPath(TreeNode node, int sum){
        List<Integer> path = new ArrayList<>();
        helper(node, sum, path);
    }
    public int helper(TreeNode node, int sum, List<Integer> path){
        if(node == null) return 0;
        path.add(node.val);
        int count = 0;
        int s = 0;
        //all paths add up to sum
        ListIterator<Integer> itr = path.listIterator(path.size());
        while(itr.hasPrevious()){
            s += itr.previous();
            if(s == sum) count ++;
        }
        count += helper(node.left, sum, path) + helper(node.right, sum, path);
        //backtrack
        path.remove(path.size() -1);
        return count;
    }
}
