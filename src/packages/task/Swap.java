package packages.task;

public class Swap {
    public static void main(String[] args) {
//        swap(10,20); c
        Integer a =10;
        Integer b =20;
        swap(a,b);
        System.out.println(a+ " "+b);

    }
    static void  swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;

    }
}
