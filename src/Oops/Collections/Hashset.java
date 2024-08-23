package Oops.Collections;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        // HashSet is used to store the unique element , It will not store the duplicate values.
        // It will not store in the insertion order
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("Orange");
        hashSet.add("Banana");

        // it will not allow to store it.
        hashSet.add("apple");
        hashSet.add("Mango");
        System.out.println(hashSet);


    }
}
