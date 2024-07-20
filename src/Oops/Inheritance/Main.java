package Oops.Inheritance;

import packages.properties.inheritance.BoxWieght;

public class Main {
    public static void main(String[] args){
        Box box1 = new Box(2.0,3.0,4.9);
        System.out.println(box1.height+" "+box1.length+" "+box1.width);



        BoxWeight box = new BoxWeight();
        System.out.println(box.weight + " "+ box.height +" "+ box.length+" "+ box.width);


        Box box2 = new BoxWeight(2,3,5,7);
        System.out.println(box2.height);



    }
}




