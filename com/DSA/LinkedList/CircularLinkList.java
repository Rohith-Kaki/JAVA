package DSA.LinkedList;

public class CircularLinkList {
    Node head;
    Node tail;
    CircularLinkList(){
        this.head = null;
        this.tail = null;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void add(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            tail = newnode;
            return; 
        }
        tail.next = newnode;
        newnode.next = head;
        tail = newnode;
    }
    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("empty list");
        }else{
        do{
            System.out.print(current.data + "-->");
            current = current.next;
        }while(current != head);
        System.out.print("____|");
        }
    }
    public void delete(int value){
        Node current = head;
        Node nx = null ;
        if(head == null){
            System.out.println("list is empty cannot delete");
            return;
        }
        if(current.data == value){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            nx = current.next;
            if(nx.data == value){
                current.next = nx.next;
                nx.next = null;
                break;
            }
            current = current.next;
        }while(current != head);
    }
    public static void main(String[] args) {
        CircularLinkList CLL = new CircularLinkList();
        CLL.add(5);
        CLL.add(15);
        CLL.add(52);
        CLL.display();
        System.out.println();
        CLL.delete(52);    
        CLL.display();
    }
}
