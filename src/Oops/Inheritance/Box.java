package Oops.Inheritance;

public class Box {
    // if i use the private key word to this variable then it can be used in this class only
    // private double height
    double height;
    double width;
    double length;

    Box(){
        this.height = -1;
        this.width = -1;
        this.length = -1;
    }

    Box(Box side){
        this.height = side.height;
        this.width =  side.width;
        this.length = side.length;
    }
    Box(double h, double w , double l){
        this.height = h;
        this.width = w;
        this.length = l;
    }

    public void information(){
        System.out.println("Hi this class is Base Class");
    }
}
