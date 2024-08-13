package Oops.LinkedList.Problems;

public class Main {
    public static void main(String[] args){
        CLL list = new CLL();
        list.insert(2);
        list.insert(9);
        list.insert(3);
        list.insert(2);
        list.insert(4);
        list.display();
        list.delete(4);
        list.display();
    }
}
