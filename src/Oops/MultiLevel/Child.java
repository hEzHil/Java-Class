package Oops.MultiLevel;

public class Child extends Parent{
    String name ;
    int age ;
    String work;

    Child(){
        super();
        this.name ="";
        this.age =-1;
        this.work ="";

    }
    Child(Child other){
        super();
        this.name = other.name;
        this.age = other.age;
        this.work = other.work;
    }

    public Child(String name, int age, int properties, long accountBal, String name1, int age1, String work) {
        super(name, age, properties, accountBal);
        this.name = name1;
        this.age = age1;
        this.work = work;
    }
    public void child(){
        System.out.println("This is Child class");
    }
}
