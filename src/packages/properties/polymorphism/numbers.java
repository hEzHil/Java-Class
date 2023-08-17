package packages.properties.polymorphism;

public class numbers {
    int total(int a,int b){
        return a+b;
    }
    double total(double a,double b){
        return a*b;
    }
    public static void main(String[] args){
        numbers num = new numbers();
        num.total(10,10);
        num.total(10.2,20.2);

    }
}
