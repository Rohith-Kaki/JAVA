package DSA.Stacks;

public class customStack {
    protected int[] data;
    int top = -1;
    private static final int DEFAULT_SIZE = 10;
    public customStack(){
        this(DEFAULT_SIZE);
    }
    public customStack(int size){
        this.data = new int[size];
    }

    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == data.length-1;
    }
    public boolean push(int num){
        if(isFull()){
            System.out.println("stack is full");
            return false;
        }   
        top++;
        data[top] = num;
        return true;
    }
    public int pop() throws stackCustomException{
        if(isEmpty()){
            throw new stackCustomException("Stack is empty to pop");
        }
        return data[top--];
    }
    public int peek() throws stackCustomException{
        if(isEmpty()){
            throw new stackCustomException("Stack is empty to peek");
        }
        return data[top];
    }
}
