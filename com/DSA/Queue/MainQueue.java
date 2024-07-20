package DSA.Queue;

public class MainQueue {
    public static void main(String[] args) throws Exception{
        CircularQueue q = new CircularQueue();
        q.push(0);
        q.push(1);
        q.push(2);
        q.push(3);
        q.display();
        System.out.println(q.pop());
        q.display();
        System.out.println(q.pop());
        q.display();
        System.out.println(q.pop());
        q.display();
        q.push(100);
        q.push(100);
        q.display();

    }
}
