package DSA.Trees;

public class AVLTrees{
    AVLTrees(){
    }
    static class Node{
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
        display(root, "RootNode");
    }
    private void display(Node node, String details){
        if(node == null) return;
        System.out.println(details +" "+ node.getValue());
        display(node.left, "left child of "+ node.getValue()+":");
        display(node.right, "right child of" + node.getValue() +":");
    }
    public void insert(int value){
        root = insert(root, value);
    }
    private Node insert(Node node, int value){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value > node.value){
            node.right = insert(node.right, value);
        }if(value<node.value){
            node.left = insert(node.left,value);
        }
        node.height = Math.max(height(node.left),height(node.right))+1;
        return rotate(node);
    }
    public Node rotate(Node node){
        if(height(node.left) > height(node.right)){
            // left side is heavy
            if(height(node.left.left) - height(node.left.right) > 0){
                //left - left case LL-rotation
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0){
                // left-right case LR-rotation (RR+LL) == left rotate + right rotate
                node.left = leftRotate(node.left);
                return rightRotate(node);
                
            }
        }
        if(height(node.left) - height(node.right) < -1 ){
            // right heavy case
            if(height(node.right.left) - height(node.right.right) < 0){
                // right right case (RR - roatation)
                return leftRotate(node);
            }
            if(height(node.right.left) - height(node.right.right) > 0){
                // right left case (RL rotation) LL+RR == right rotate + left rotate
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }
    public Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right; //p.left.right;
        c.right = p;
        p.left = t;
        p.height = Math.max(height(p.left), height(p.right))+1;
        c.height = Math.max(height(c.left), height(c.right))+1;
        return c;
    }
    public Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;
        p.left = c;
        c.right = t;
        p.height = Math.max(height(p.left), height(p.right))+1;
        c.height = Math.max(height(c.left), height(c.right))+1;
        return p;
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
        AVLTrees avl = new AVLTrees();
        // int[] nums = {1,2,3,4,5,6,7,8,9};
        // avl.populateSortedArray(nums);
        for(int i=0;i<1000;i++){
            avl.insert(i);
        }
        avl.display();
    }
}