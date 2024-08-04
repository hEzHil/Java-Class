package Oops.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // Here ArrayList has the implementation that List interface provides
        List<Integer> list = new ArrayList<>();
        list.add(40);
        list .add(45);

        List<Integer> list2 = new LinkedList<>();
            list2.add(2);
            list2.add(4);


            List<Integer> vector = new Vector<>();
            vector.add(55);
            vector.add(5);
            vector.add(3);
        System.out.println(vector);





    }
}
