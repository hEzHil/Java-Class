package Oops;

public class WrapperClass {
    public static void main(String[] args) {
        // Wrapper class will use primitive into using it as an object

        Integer a = new Integer(10);
        // or
        Integer b = 20;
        // it is creating the object 20 in the heap memory

    }
    class A {
      final   int num =10;
      String name ;

      A (String name){
          this.name = name;
      }
      @Override
        protected void finalize() throws Throwable{
          System.out.println("Object destroyed");
      }

    }
}
