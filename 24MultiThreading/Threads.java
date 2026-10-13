// package 24MultiThreading;

class MyThread extends Thread {
    public void run() {
        for(int i=0;i<4;i++) {
            System.out.println("Thread 1 is running...");
            try{
            Thread.sleep(3000);
            }
            catch(Exception e){
                System.out.println(e);

            }
        }
       
    }
}   

class MyThread2 extends Thread {
    public void run() {
        for(int i=0;i<4;i++) {
            System.out.println("Thread 2 is running...");
            try{
            Thread.sleep(3000);
            }
            catch(Exception e){
                System.out.println(e);

            }
        }
    }
}

// class MyRunnable implements Runnable {
//     public void run() {
//         System.out.println("Runnable thread is running...");
//     }
// }

public class Threads {
    public static void main(String args[]){
        
        MyThread t1 = new MyThread();
        t1.start();
        MyThread2 t2 = new MyThread2();
        t2.start();
        // MyRunnable r1 = new MyRunnable();
        // Thread t3 = new Thread(r1);
        // t3.start();

    }

    
}
