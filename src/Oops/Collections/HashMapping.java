package Oops.Collections;

import java.util.HashMap;

public class HashMapping {
    public static void main(String[] args) {
        // It is used to store the key-values pairs, which key maps to exact one value
        HashMap<Integer, String> hashMap = new HashMap<>();
        // here we ( key - 1, value - Ajay)
        // it cannot duplicate the key , but values can be duplicate
        hashMap.put(1, "Ajay");
        hashMap.put(2, "Ezhil");
        hashMap.put(3, "Yosuva");
        hashMap.put(4, "Bentley");
        hashMap.put(5, "Ajay");


        // here are some methods
        System.out.println(hashMap);


    }

}
