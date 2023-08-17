package Inheritance2;
 class Parent {
    static void eat(){
        System.out.println("This is Parent Class");
    }
}
 class Child extends Parent{
     static void child(){
         System.out.println("This is Child  Class");
     }
}
class pen extends Child{
 }
class call{
    public static void main(String[] args) {
        Parent Hilary = new Parent();
        Hilary.eat();
        Child Ezhil = new Child();
        Ezhil.child();
        Parent Mahil = new Child();
        Mahil.eat();
        pen Pen = new pen();
        pen.eat();
    }
}
