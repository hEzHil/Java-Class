package Oops.MultiLevel;

public class GrandChild extends Child{

    String grandson ;
    int age;
    int standard;

    GrandChild(){
        super();
        this.grandson = "";
        this.age =-1;
        this.standard = -1;
    }

    GrandChild(GrandChild other ){
        super();
        this.grandson = other.grandson;
        this.age = other.age;
        this.standard = other.standard;
    }

    public GrandChild(String name, int age, int standard) {
        this.grandson = name;
        this.age = age;
        this.standard = standard;
    }

    public GrandChild(String name, int age, int properties, long accountBal, String name1, int age1, String work, String name2, int age2, int standard) {
        super(name, age, properties, accountBal, name1, age1, work);
        this.grandson = name2;
        this.age = age2;
        this.standard = standard;
    }


    public void output(){
        System.out.println("hi, this is subclass of child");
    }
}
