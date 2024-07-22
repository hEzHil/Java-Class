package Oops.MultipleInheritance.ExtendInterface;



public class Main implements B{

    // By inheriting the interface A to B , the method of A also can accessed
    @Override
    public void greeting() {

    }

    @Override
    public void welcome() {

    }

    public static void main(String[] args) {
        A.message();
    }
}
