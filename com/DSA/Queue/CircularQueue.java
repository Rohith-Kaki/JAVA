package DSA.Queue;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int rear = 0;
    protected int front = 0;
    private int size = 0;
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }
    public boolean push(int num){
        if(isFull()){
            System.out.println("Queue is full");
            return false;
        }
        data[rear++] = num;
        rear = rear % data.length;
        size++;
        return true;
    }
    public int pop() throws Exception{ //O(1)
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[front];
    }
    public boolean isFull(){
        return size == data.length;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        int i = front;
        do{
            System.out.print(data[i]+" ");
            i++;
            i %= data.length;
        }while(i!=rear);
        System.out.println("END");
    }

}
