package Oops.Inheritance;

public class BoxWeight extends Box{

    public double weight;
     BoxWeight(){
        this. weight = -1;
    }
    BoxWeight(BoxWeight other){
         super(other);
         weight = other.weight;
    }

    public BoxWeight(double h, double w, double l, double weight) {
        super(h, w, l);// what is this? call the parent class constructor
        // used to initialize the value that present in the parent class
        this.weight = weight;
    }
}
