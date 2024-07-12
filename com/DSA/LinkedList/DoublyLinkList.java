package DSA.LinkedList;

public class DoublyLinkList {
    Node head;
    private int size;
    DoublyLinkList(){
        size = 0;
    }
    public class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
            size++;
        }
    }
    public void addFirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        newnode.prev = null;
        head = newnode;
    }
    public void addLast(int data){
        Node newnode = new Node(data);
        if(head == null){
            newnode.prev = null;
            head = newnode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        newnode.next = null;
        current.next = newnode;
        newnode.prev = current;
    }
    public Node find(int data){
        Node current = head;
        while (current != null) {
            if(current.data == data){
                return current;
            }
            current = current.next;
        }
        return null;
    }
    public void insertAfterElement(int data,int Element){
        Node newnode = new Node(data);
        Node p = find(Element);
        if(p == null){
            System.out.println("ELement doesnot exist");
        }else{
            newnode.next = p.next;
            newnode.prev = p;
            p.next = newnode; 
            if(newnode.next != null){
                newnode.next.prev = newnode;
            }
        }
    }
    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -->");
            current = current.next;
        }   
        System.out.print("end");
    }
    public void displayReverse(){
        Node current = head;
        Node last = null;
        while (current != null) {
            last = current;
            current = current.next;
        }
        while(last != null ){
            System.out.print(last.data + "-->");
            last = last.prev;
        }
        System.out.print("start");
    }
    public int size(){
        return size;
    }
    public static void main(String[] args) {
        DoublyLinkList DL = new DoublyLinkList();
        DL.addFirst(0);
        DL.addLast(13);
        DL.addLast(4);
        DL.addLast(15);
        System.out.println(DL.size);
        DL.display();
        DL.insertAfterElement(44, 15);
        System.out.println();
        DL.display();

        // System.out.println();
        // DL.displayReverse();
    }
}
