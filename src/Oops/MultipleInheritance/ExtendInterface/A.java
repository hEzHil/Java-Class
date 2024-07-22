package Oops.MultipleInheritance.ExtendInterface;

public interface A {
    void greeting();

    //static method should always have a body
    // call via the interface name
    // like A.message();
    static void message(){
        System.out.println("hi");
    }
}
