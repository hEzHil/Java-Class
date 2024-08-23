package Oops.MultiThread;

//Synchronization is a mechanism that controls
// the access of multiple threads to shared resources.
// It ensures that only one thread can access the resource at a time,
// preventing race conditions and ensuring data consistency.
class Table  {
   synchronized void run(int num){
        for (int i = 1; i <=10; i++) {
            System.out.println( i * num );
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }
}
public class MTSync {
    public static void main(String[] args) throws InterruptedException {
        Table table = new Table();
        Thread t1 = new Thread(){
            public void run(){
                table.run(5);
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                table.run(10);
            }
        };
        t1.start();
        t2.start();

    }
}
