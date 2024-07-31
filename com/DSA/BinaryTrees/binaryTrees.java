package DSA.BinaryTrees;

import java.util.Scanner;

public class binaryTrees {
    public binaryTrees(){

    }
    private static class Node{
        int value;
        Node right;
        Node left;
        public Node(int value){
            this.value = value;
        }
    }
    private Node root;
    public void populate(Scanner sc){
        System.out.println("Enter ther root Node:");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc,root);
    }
    private void populate(Scanner sc, Node node){
        System.out.println("Do you want to enter left " + node.value);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter the value for left of " + node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc,node.left);
        }
        System.out.println("Do you want to enter right " + node.value);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the value for right of " + node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }
    public void display(){
        display(root,"");
    }
    private void display(Node node, String indent){
        if(node == null) return;
        System.out.println(indent+node.value);
        display(node.left , indent + "\t");
        display(node.right , indent + "\t");
    }
    public void prettydisplay(){
        prettydisplay(root, 0);
    }
    private void prettydisplay(Node node, int level){
        if(node == null) return;
        prettydisplay(node.right, level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------->"+node.value);
        }else{
            System.out.println(node.value);
        }
        prettydisplay(node.left, level+1);
    }
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node == null) return;
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node == null) return;
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        binaryTrees tree = new binaryTrees();
        tree.populate(sc);
        tree.prettydisplay();
    }
}
