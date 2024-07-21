package Oops.Polymorphism;

public class Square extends Shapes{

   @Override
    void area(){
        System.out.println("I am the square shape");
    }

    int left ;
    int right;
    int top;


    // this is compile time or static polymorphism
    // it is achieved by method overloading
    // because we have used the same name for two  methods  and the parameters are different

   void   area (int left, int right){
        this.left = left;
        this.right =right;
    }

    void area(int left, int right, int top) {
        this.left = left;
        this.right = right;
        this.top = top;
    }
}
