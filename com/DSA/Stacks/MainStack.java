package DSA.Stacks;

public class MainStack {
    public static void main(String[] args) throws stackCustomException{
        customStack s = new DynamicStack(5);
        System.out.println(s.push(0));
        s.push(2);
        s.push(2);
        s.push(3);
        s.push(4); 
        s.push(4); 
        s.push(4);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
