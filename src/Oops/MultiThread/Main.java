package Oops.MultiThread;

//Multithreading in Java is a feature that allows the concurrent
// execution of two or more threads. A thread is a lightweight process,
// and multithreading is a mechanism in which multiple threads run independently
// but share the same resources like memory. This is useful for performing multiple tasks
// simultaneously within a program, which can lead to better resource utilization and improved performance.

// Thread: A thread is the smallest unit of
// processing that can be performed in an operating system.
//  It is a sequence of programmed instructions that can be
//  executed independently of other code.

//  Multithreading: It refers to a process of executing multiple
//  threads simultaneously within a single program or application.
//  Each thread runs concurrently, sharing resources such as memory,
//  but executing independently.

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Book book = new Book();
//        Book book2 = new Book();
        Num num = new Num();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("runnable");
                    try{Thread.sleep(3000);}catch (InterruptedException e){}
                }
            }
        };
        Runnable runnable2 = () ->{
            for (int i = 0; i < 5; i++) {
                System.out.println("runnable");
                try{Thread.sleep(3000);}catch (InterruptedException e){}
            }
        };


        Thread t1 = new Thread(book);
        t1.start();

//        book.start();
//      book2.start();

        // Now printNum method will execute
        // before the book thread start
        // if I need to wait printNum() until book thread
        // to finish its task  then there is method called join()
//         book.join();
        t1.join();
        num.printNum();

    }
}



// we can use Extends keyword to inherit the Thread Class .
// what will u do when you want to extend another class ?
// so there we can use Runnable interface instead of extend Thread method
//class Book extends Thread{
    class Book implements Runnable{

    // To implement the Thread  method , function name  should be run().
    // for every method which want to execute Thread operation means function should be named as run()
   public  void run()  {
        for (int i = 0; i < 5; i++) {
            System.out.println("Update");
            // 3000 millisecond it is waiting for to run the method // actually it is 3 seconds
            try{Thread.sleep(3000);} catch (InterruptedException e){}
        }
//       System.out.println("Thread is running: " + Thread.currentThread().getName());

   }
}
class Num{
    void printNum(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
