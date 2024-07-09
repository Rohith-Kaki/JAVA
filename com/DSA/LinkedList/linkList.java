package DSA.LinkedList;

public class linkList {
    Node head;
    private int size;
    linkList(){
        size = 0;
    }
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
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

    public static void main(String[] args){
        linkList LL = new linkList();
        LL.addFirst(0);
        LL.addFirst(0);
        LL.addFirst(0);
        LL.display();
        LL.deleteEnd();
        LL.deleteFirst();
        System.out.println(LL.getSize());
        // System.out.println(LL.deleteEnd());
        LL.display();
    }
}
