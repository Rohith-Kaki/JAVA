class multithread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getPriority());
    }
}

public class Threads {
    public static void main(String[] args) {
        multithread t1 = new multithread();
        multithread t2 = new multithread();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        }
}
