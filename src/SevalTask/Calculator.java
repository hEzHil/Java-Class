package SevalTask;


public class Calculator {
    public static void main(String[] args) {

        System.out.println(sum(20,20));
        System.out.println(Product(5,10));

    }
    static int  sum(int a , int b){
        int c = a + b ;
        return c;

    }
    static int Product(int a ,int b){
        int c = a * b;
        return c;
    }
    static int Difference(int a ,int b){
        int c = a - b;
        return c;
    }
    static int Quotient(int a , int b){
        int c = a / b;
        return c;
    }
}
