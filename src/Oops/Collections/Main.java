package Oops.Collections;

import java.util.*;

public class Main {

    // Java collection framework  is collection of libraries for basic data structures and algorithm
    public static void main(String[] args) {
        // Here ArrayList has the implementation that List interface provides
        List<Integer> list = new ArrayList<>();
        list.add(40);
        list .add(45);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        IntSummaryStatistics stats = numbers.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("Lowest number in list : " + stats.getMin());
        System.out.println("Highest number in list : "+ stats.getMax());


        List<Integer> list2 = new LinkedList<>();
            list2.add(2);
            list2.add(4);


            List<Integer> vector = new Vector<>();
            vector.add(55);
            vector.add(5);
            vector.add(3);
        System.out.println(vector);

        ArrayList<Integer> arr = new ArrayList<>();




    }
}
