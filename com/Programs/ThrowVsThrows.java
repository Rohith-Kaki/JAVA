public class ThrowVsThrows {
    public static void main(String[] args) {
        try{
            radius(-30);
        }catch (ArithmeticException e){
            System.out.println("caught "+ e);
        }
    }
    public static void radius(int r) throws ArithmeticException{
        if(r<0){
            throw new ArithmeticException("bye");
        }else{
            System.out.println("no worries");
        }
    }
}
