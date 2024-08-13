package Oops.LinkedList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(2);
        list.insertFirst(4);
        list.insertFirst(5);
//        list.insertFirst(6);
//        list.insertFirst(9);
//        list.insertLast(99);
//        list.insert(23,3);
//        list.display();
//        System.out.println( list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();
//
//        System.out.println(list.find(7));

//        DLL list2 = new DLL();
//        list2.insertFirst(23);
//        list2.insertFirst(25);
//        list2.insertFirst(27);
//        list2.insertFirst(22);
//        list2.insertFirst(21);
//        list2.display();
////        list2.displayReverse();
//        list2.insertLast(22);
//        list2.display();
//        list2.insertLast(29);
//        list2.display();
//        list2.insertAfter(22,20);
//        list2.display();


        list.insertRec(88 ,2);
        list.display();
       list.find(88);


    }
}
