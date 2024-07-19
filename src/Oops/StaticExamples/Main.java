package Oops.StaticExamples;

public class Main {
    public static void main(String[] args){
        Human ezhil = new Human("Ezhil", 22, 30000, false);
        Human ajay = new Human("Ajay", 22, 35000, false);
        System.out.println(ezhil.name);
        System.out.println(Human.population);

        // fun() it will give error because of it is non-static method
        // u can use it through creating object for this method
        Main obj = new Main();
        obj.fun();

    }
    // int this non-static method , it cannot used without creating object for in the main method
    // because non-static methods are relies on object
    // for example check in line 10
    void fun(){
        System.out.println("I am kidding");
    }
    // this method is declared as static , it can be accessed before any object created of its class
    static void fun2(){
        System.out.println("I have been so tried");
    }
}
