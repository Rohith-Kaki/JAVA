package LAB.LAB_3;
public class reverseString{
    public static void main(String[] args) {
        StringBuilder word = new StringBuilder();
        String org = "hello World";
        for(int i=org.length()-1;i>=0;i--){
            word.append(org.charAt(i));
        }
        System.out.println(word.toString());

        //line code 
        // System.out.println(new StringBuilder(org).reverse().toString());
    }
}