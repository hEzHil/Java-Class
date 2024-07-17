package String;

import java.util.ArrayList;

public class StringClass {
    public static void main(String[] args) {
        // by declaring  this String it will be allocated into String pool which is in heap memory
        String a = "Ezhil";
        String b = "Ezhil";

        // here it will give true because it is in string pool
        System.out.println(a == b);

        //By declaring this String it will be created new object outside the String pool
        String name = new String("Ezhil");
        String name2 = new String("Ezhil");

        // for example
        // it will give false because the name is created new object outside of the string pool
        System.out.println(name2 == name);

        // here it will give the true because its check the object value
        System.out.println(name.equals(name2));


        // it will print the sum of asc  value of a and c
        System.out.println('a' + 'c' );

        System.out.println("a" +1);
        //integer will be converted to Integer that will call toString method.

        // return empty arrayList
        System.out.println("ezhil" + new ArrayList<>());


        // in this there should be atleast one string type so this will work otherwise it will not
        // if u have any doubt in future just try it without using string "";
        System.out.println(new Integer(10) + "" + new ArrayList<>());

        // So in String object + operator overloaded
        System.out.println("a" + "b");


    }
}
