package Leetcode.Easy;


class Solution{
    public TreeNode levelSuccessor(TreeNode root, int target){
        if(root == null){
            return null;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode currentNode = q.poll();
            if(currentNode.left != null){
                q.offer(currentNode.left);
            }
            if(currentNode.right != null){
                q.offer(currentNode.right);
            }
            if(currentNode.val == target){
                break;
            }
        }
        return q.peek();
    }
}






public class LevelOrderSuccessor {
    
}
