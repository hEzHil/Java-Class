package Oops.AbstractDemo;

public class Son2 extends Parent{

    public Son2(int age) {
        super(age);
    }

    @Override
    void carrer() {
        System.out.println("I am interested in Java Developer");
    }

    @Override
    void partner() {
        System.out.println("I did not have any life partner");
    }
}
