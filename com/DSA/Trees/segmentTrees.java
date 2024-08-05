package DSA.Trees;

public class segmentTrees {
    private static class Node{
        int data;
        int startidx;
        int endidx;
        Node right;
        Node left;
        public Node(int startidx,int endidx){
            this.startidx = startidx;
            this.endidx = endidx;
        }
    }
    Node root;
    public segmentTrees(int[] arr){
        this.root = constructTree(arr,0,arr.length-1);
    }
    private Node constructTree(int[] arr, int start, int end){
        if(start == end){
            Node leafNode = new Node(start,end);
            leafNode.data = arr[start];
            return leafNode;
        }
        Node node = new Node(start, end);
        int mid = (start+end)/2;
        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid+1, end);
        node.data = node.left.data + node.right.data;
        return node;
    }
    public void display(){
        display(this.root);
    }
    private void display(Node node){
        String str = "";
        if(node.left != null){
            str = str + "Interval=[" + node.left.startidx + "-" + node.left.endidx + "] and data " + node.left.data +" => ";
        }else{
            str = str + "no left child";
        }
        //for current node
        str = str + "Interval=[" + node.startidx + "-" + node.endidx + "] and data " + node.data +" => ";

        if(node.right != null){
            str = str + "Interval=[" + node.right.startidx + "-" + node.right.endidx +"] and data  " + node.right.data;
        }else{
            str = str + "no right child";
        }
        System.out.println(str+'\n');
        //call recurssion 
        if(node.left != null){
            display(node.left);
        }if(node.right != null){
            display(node.right);
        }
    }
    //query  sum of elements from sindex to eindex given by user  O(logn)
    public int query(int querys, int querye){
        return this.query(this.root,querys, querye);
    }
    private int query(Node node, int querys, int querye){
        if(node.startidx >= querys && node.endidx<=querye){
            //query index lies completely inside the node index.
            return node.data;
        }else if(node.startidx > querye || node.endidx < querys){
            //range lies outside the query index.
            return 0;
        }else{
            //overlaping : call left and right.
            return this.query(node.left, querys, querye) + this.query(node.right, querys, querye);
        }
    }
    public void update(int index, int newvalue){
        this.root.data = update(root, index, newvalue);
    }
    //update a value in the segment tree in O(logn) time, this done by reaching to the leaf node
    //(i.e) given index and then by using recurssion we will update all node with new value while
    //reaching the root node.
    private int update(Node node,int index, int newvalue){
        //step-1 check given index is in range or not
        if(index >= node.startidx && index <= node.endidx){
            //base conditon (it is in the leaf node update the value)
            if(index == node.startidx && index == node.endidx){
                node.data = newvalue;
                return node.data;
            }else{
                //check left and right and return sum of those answers
                int leftans = update(node.left, index, newvalue);
                int rightans = update(node.right, index, newvalue);
                node.data = leftans + rightans;
                return node.data;
            }
        }
        //if it is completely ouside return value of the node , becuase if any changes occured we 
        //need to update the sum also.
        return node.data;
    }
    public static void main(String[] args) {
        int[] arr = {3,8,7,6,-2,-8,4,9};
        segmentTrees tree = new segmentTrees(arr);
        // tree.display();
        System.out.println(tree.query(2, 6));
    }
}
