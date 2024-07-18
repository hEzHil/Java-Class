package Oops;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] name = new int[5];

//        Student[] student1 = new Student[5];
//        System.out.println(Arrays.toString(student1));
          Student student = new Student();
          System.out.println(student.rno);
          System.out.println(student.mark);
          System.out.println(student.name);
          student.greeting();

          // creating the new student object and and passing the values through the constructor
          Student student1 = new Student(10, "Ezhil" ,70.56f );
          System.out.println(student1.name);
          System.out.println(student1.rno);System.out.println(student1.mark);
          student1.greeting();
          student1.changeName("Mahil");
          System.out.println(student1.name);


        // This object create new object with already existing name
        // for example , I have passed the value student1 ,
        // there student name is mahil so here also i am declaring the same value
          Student random = new Student(student1);
          System.out.println(random.name);


    }
}
// create a class for every single student
class Student{
    int rno;
    String name;
    float mark;

    void changeName(String name){
        this.name = name;
    }

    void greeting(){
        System.out.println("Hello My name is " + this.name);
    }

    //this basically defines What happen when the object is created
//    Student(){
//        this.rno = 14;
//        this.name = "Ajay";
//        this.mark = 89.90f;
//    }


    //how to call the constructor through the constructor
    Student (){
        //internally  new Student(50,"virat", 50.50f);
        this (50,"virat", 50.50f);
    }


    // It is known as Constructor overloading
    // Student ezhil = new Student(10, "Ezhil",80.90f)
    //here this keyword will replace with ezhil variable name
    Student(int rno , String name, float mark){
        //ezhil.rno = 10
        this.rno = rno;
        //ezhil.name = Ezhil
        this.name = name;
        //ezhil.mark = 80.90f
        this.mark = mark;
    }

    Student (Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.mark = other.mark;
    }
}
