public class trow {
    public static void main(String[] args) {
      int a = 20;
      try{
        if(a==20){
            throw new ArithmeticException("dja;");
        }else{
            System.out.println("no error");
        }
      }catch(ArithmeticException e){
        System.out.println("caught" + e);
      }
    }
}
