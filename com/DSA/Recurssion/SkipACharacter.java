package DSA.Recurssion;

public class SkipACharacter {
    public static void main(String[] args) {
        // Skip("","bb");
        System.out.println(Skip("dfhjadhjaa"));
    }
    public static void Skip(String p, String up){
        up.toLowerCase();
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            Skip(p, up.substring(1));
        }else{
            Skip(p+ch, up.substring(1));
        }
    
    }
    public static String Skip(String up){
        up.toLowerCase();
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return Skip(up.substring(1));
        }else{
            return ch +Skip( up.substring(1));
        }
    }
}   
