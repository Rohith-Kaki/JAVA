package DSA.Queue;

public class DynamicQueue extends CircularQueue {
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }
    @Override
    public boolean push(int num){
        if(this.isFull()){
            //double size of the array
            int[] temp = new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i] = data[(front+i)%data.length];
            }
            front = 0;
            rear = data.length;
            data = temp;    
        }
        //at this point we know array is not full call customstack push method.
        return super.push(num);
    }
    }
}
