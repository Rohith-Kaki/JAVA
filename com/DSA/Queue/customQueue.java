package DSA.Queue;

public class customQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int rear = 0;
    public customQueue(){
        this(DEFAULT_SIZE);
    }
    public customQueue(int size){
        this.data = new int[size];
    }
    public boolean push(int num){
        if(isFull()){
            System.out.println("Queue is full");
            return false;
        }
        data[rear++] = num;
        return true;
    }
    public int pop() throws Exception{//O(n)
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[0];
        //shift all elements to left :O(n)
        for(int i=1;i<rear;i++){
            data[i-1] = data[i];
        }
        rear--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }
    public boolean isFull(){
        return rear == data.length;
    }
    public boolean isEmpty(){
        return rear == 0;
    }
    public void display(){
        for(int i=0;i<rear;i++){
            System.out.print(data[i] + " ");;
        }
        System.out.println("end");
    }
}
