package Leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Node;

public class NAryTreePostOrderTraversal {
    /*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        helper(root, ans);
        return ans;
    }
    private void helper(Node root, List<Integer> ans){
        for(Node child: root.children){
            helper(child, ans);
        }
        ans.add(root.val);
    }
}
}
