class myException extends Exception{
    public myException(String s){
        super(s);
    }
}
public class CustomException{
    public static void main(String[] args) {
        try{
            throw new myException("exception occured");
        }catch(myException e){
            System.out.println("in catch block" + e);
            // System.out.println(e.getMessage());
        }
    }
}