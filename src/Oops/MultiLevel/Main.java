package Oops.MultiLevel;

public class Main {
    public static void main(String[] args) {
        GrandChild m = new GrandChild();
        GrandChild ezhil = new GrandChild("Ezhil",17, 12);
        GrandChild mahil = new GrandChild("Anthony",60,4,100000,
                "hilary",40,"It","Mahil",10,5);
        System.out.println(m.accountBal);
    }
}
