package Oops.HierarchalInheritance;

public class Toyota extends Car{
    String name ;
    boolean roof;

    Toyota(){
        this.name ="Toyota";
        this.roof = false;
    }

    public Toyota(String name, boolean roof) {
        this.name = name;
        this.roof = roof;
    }

    public Toyota(String engine, int tyre, int door, String name, boolean roof) {
        super(engine, tyre, door);
        this.name = name;
        this.roof = roof;
    }
}
