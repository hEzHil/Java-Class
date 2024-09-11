package Oops.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> s = new ArrayList<>();
        s.add(new Student("Ezhil",21));
        s.add(new Student("Ajay",22));
        s.add(new Student("Yosuva",20));
        s.add(new Student("Ben",19));
        Collections.sort(s);

        for (Student student :s) {
            System.out.println(student);
        }
    }

}
