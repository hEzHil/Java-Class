package Oops.SingleTon;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        // You can now use obj to call methods of Singleton class
        System.out.println("Singleton instance: " + obj);
    }
}
