package DSA.BinaryTrees;

public class BinarySearchTree {
    public BinarySearchTree(){

    }
    public static class Node{
        private int value;
        private Node right;
        private Node left;
        private int height;
        public Node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;
    public int height(Node node){
        if(node == null) return -1;
        else return node.height;
    }
    public boolean isEmpty(){
        return root == null;
    }
    public void display(){
        display(root, "RootNode:");
    }
    private void display(Node node, String details){
        if(node == null) return;
        System.out.println(details + node.getValue());
        display(node.left , "left child of" + node.getValue() + ":");
        display(node.right , "right child of" + node.getValue() + ":");
    }
    public void insert(int value){
        root = insert(root, value);
    }
    private Node insert(Node node, int value){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(node.left, value);
        }if(value > node.value){
           node.right = insert(node.right,value);
        }
        node.height = Math.max(height(node.left),height(node.right))+1;
        return node;
    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null) return true;
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }
    public void populate(int[] nums){
        for(int i=0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }
    public void populateSortedArray(int[] nums){
         populateSortedArray(nums, 0, nums.length);
    }
    private void populateSortedArray(int[] nums, int start, int end){
        if(start >= end) return;  //n*logn 
        int mid = start + (end-start)/2;
        this.insert(nums[mid]);
        populateSortedArray(nums, start, mid);
        populateSortedArray(nums, mid+1, end);
    }
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] nums = {1,2,3,4,5,6,7,8,9};
        bst.populateSortedArray(nums);
        bst.display();
    }
}
