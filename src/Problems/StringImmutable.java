package Problems;

public class StringImmutable {
    public static void main(String[] args) {
        String name = "ezhil";
        String end = name;
        System.out.println(name == end);
        System.out.println(name);
        name =" ez";
        System.out.println(name == end);
        System.out.println(end);
        System.out.println(name);

    }


}
