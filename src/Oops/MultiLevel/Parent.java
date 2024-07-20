package Oops.MultiLevel;

public class Parent {

    String name ;
    int age ;
    int properties;
    long accountBal;

    Parent(){

        this.name ="";
        this.age  =-1;
        this.properties =-1;
        this.accountBal=-1;
    }

    Parent(Parent other){
            this.name = other.name;
            this.age = other.age;
            this.properties = other.properties;
            this.accountBal =other.accountBal;
    }

    public Parent(String name, int age, int properties, long accountBal) {
        this.name = name;
        this.age = age;
        this.properties = properties;
        this.accountBal = accountBal;
    }

    public void notice(){
        System.out.print("Hi , This is parent class");
    }
}
