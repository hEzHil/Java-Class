package Oops.AbstractDemo;

// Abstraction  focuses on hiding the complex implementation details
// of a system and exposing only the necessary and relevant features to the user
//The primary goal of abstraction is to reduce complexity and increase
// efficiency by providing a simplified model of a real-world entity.
public class Main {
    public static void main(String[] args){
        Son son = new Son(28);
        son.carrer();
        son.partner();
        int age = son.age;
        System.out.println(age);
        son.normal();

        // cannot create a object for Parent class because that is abstract class
//        Parent parent = new Parent() {
//
//        }

        // but u can create for variables
        Parent daughter = new Daugter(21);
        daughter.partner();

        Son2 son2 = new Son2(13);
        son2.carrer();

    }
}
