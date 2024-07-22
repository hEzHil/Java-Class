package Oops.AbstractDemo;

public abstract class Parent {
    int age ;



    public Parent(int age) {
        this.age = age;
    }

    void normal(){
        System.out.println("Its normal method");
    }

    abstract void carrer();
    abstract void partner();


}
