package DSA.LinkedList;

public class linkList {
    Node head;
    Node tail;
    private static int size;
    linkList(){
        size = 0;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
        Node(int data, Node next){
            this.data = data;
            this.next = next;
            size++;
        }
    }
    //Add at first
    public void addFirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    //Add at last
    public void addLast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newnode;
    }
    public int deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return 0;
        }
        size--;
        Node temp = head;
        head = head.next;
        temp.next = null;
        return temp.data;
    }
    public int deleteEnd(){
        if(head == null){
            System.out.println("list is empty");
            return 0; 
        }
        size--;
        if(head.next == null){//when there is a single node in the linkedList
            int data = head.data;
            head = null;
            return data;
        }
        Node current = head;
        Node prev = null;
        while(current.next != null){
            prev = current;
            current = current.next;
        }
        int data = current.data;
        prev.next = null;
        return data;
    }
    public void insertRecursion(int data, int index){
        head = insertRecursion(data,index,head);
    }
    public Node insertRecursion(int data, int index, Node node){
        if(index == 0){
            Node newnode = new Node(data,node);
            return newnode;
        }
        node.next = insertRecursion(data, index-1, node.next);
        return node;
    }
    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("none");
    }
    public int getSize(){
        return size;
    }
    public void duplicates(){
        Node current = head;
        while(current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
                size--;
            }else{
                current = current.next;
            }
        }
    }
    public void tail(){
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        tail = current;
    }
    public void reversal(Node head){
        Node current1 = head;
        if(tail == current1){
            head = current1;
            return;
        }
        reversal(current1.next);
        tail.next = current1;
        tail = current1;
        tail.next = null;
    }

    public static void main(String[] args){
        linkList LL = new linkList();
       LL.addLast(1);
       LL.addLast(2);
       LL.addLast(2);
       LL.addLast(3);
       LL.addLast(4);
       LL.addLast(4);
        LL.display();
        System.out.println();
        // LL.insertRecursion(44, 4);
        LL.tail();
        // LL.deleteEnd();
        // LL.deleteFirst();
        System.out.println(LL.getSize());
        // // System.out.println(LL.deleteEnd());
        // LL.display();
    }
}
