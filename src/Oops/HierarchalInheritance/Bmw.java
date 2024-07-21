package Oops.HierarchalInheritance;

public class Bmw  extends Car{

    String name;
    boolean roof;

    Bmw(){
        this.name ="Bmw";
        this.roof = true;
    }

    public Bmw(String name, boolean roof) {
        this.name = name;
        this.roof = roof;
    }

    public Bmw(String engine, int tyre, int door, String name, boolean roof) {
        super(engine, tyre, door);
        this.name = name;
        this.roof = roof;
    }
}
