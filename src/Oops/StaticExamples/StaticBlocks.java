package Oops.StaticExamples;

public class StaticBlocks {
    static int  a = 10;
    static int b;

    // Will run only once , when the first object is created
    static {
        b = a * 5;
    }

    static int num = 10;

    static int num2 =2;

    static {
        num2 *= num;
    }

    public static void main(String[] args){
        StaticBlocks obj = new StaticBlocks();
        System.out.println(StaticBlocks.a + " " + StaticBlocks.b);

        System.out.println(StaticBlocks.num +" "+ StaticBlocks.num2);
    }
}
