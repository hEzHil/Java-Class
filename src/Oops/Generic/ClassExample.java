package Oops.Generic;
// Generics means parameterized types.
// The idea is to allow type (Integer, String, … etc., and user-defined types)
// to be a parameter to methods, classes, and interfaces.
// Using Generics, it is possible to create classes that work with different data types.
// An entity such as class, interface, or method that operates on a parameterized type is a generic entity.

public class ClassExample {
    public static void main(String[] args) {
        Pairs<Integer , String> gen = new Pairs<>();
        gen.a = 10;
        gen.s = "Ezhil";
        System.out.println(gen.a);
    }
}
class Pairs<T, S>{
    T a;
    S s;
}
