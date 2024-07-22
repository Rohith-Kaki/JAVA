package Programs;
//method - 1
// class NewThread extends Thread{
//     public void run(){
//         System.out.println("running");
//     }
// }

//method -2 
// public class Mythread{
//     public static void main(String[] args) {
//         NewThread t1 = new NewThread();
//         t1.start();
//     }
// }


//method - 3
// class NewThread implements Runnable{
//     public void run(){
//         System.out.println("running");
//     }
// }
// public class Mythread{
//     public static void main(String[] args) {
//         Thread t1 = new Thread(new NewThread());
//         t1.start();
//     }
// }

//method - 4
// public class Mythread{
//     public static void main(String[] args) {
//         Thread t1 = new Thread(() ->{
//             System.out.println("running");
//         });
//         t1.start();
//     }
// }
    
class Newthread extends Thread{
    int thread;
    public Newthread(int thread){
        this.thread = thread;
    }
    public void run(){
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName());
    }
}


public class Mythread{
    public static void main(String[] args) {
         Newthread t1 = new Newthread(0);
         Newthread t2 = new Newthread(1);
         t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
         t1.start();
         t2.start();
        }
    }