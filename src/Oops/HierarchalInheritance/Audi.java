package Oops.HierarchalInheritance;

public class Audi extends Car{

    String name ;
    boolean roof;

    Audi(){
        this.name = "Audi";
        this.roof = true;
    }

    public Audi(String name, boolean roof) {
        this.name = name;
        this.roof = roof;
    }

    public Audi(String engine, int tyre, int door, String name, boolean roof) {
        super(engine, tyre, door);
        this.name = name;
        this.roof = roof;
    }
}
