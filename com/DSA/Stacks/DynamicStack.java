package DSA.Stacks;

public class DynamicStack extends customStack {
    public DynamicStack(){
        super();//it will call customStack with no parameters.
    }
    public DynamicStack(int size){
        super(size); //it will call customStack with one parameters.
    }
    @Override
    public boolean push(int num){
        if(this.isFull()){
            //double size of the array
            int[] temp = new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        //at this point we know array is not full call customstack push method.
        return super.push(num);
    }
}
