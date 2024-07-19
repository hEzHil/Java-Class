package Oops.StaticExamples;

public class Human {
    String name;
    int age;
    int salary;
    boolean married;

    // By declaring the static variable u can use population without creating any object for the class
   static long population;

   static void message(){
       System.out.println("Good Morning");
   }

    public Human(String name, int age, int salary, boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
        Human.message();
    }
}
