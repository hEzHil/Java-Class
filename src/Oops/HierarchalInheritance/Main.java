package Oops.HierarchalInheritance;

public class Main {
    public static void main(String[] args) {

        Toyota urban = new Toyota("Urban Cruiser", true);
        System.out.println(urban.name +" "+urban.roof);

        Toyota inova = new Toyota("Turbo", 4, 4,"Innova",false);
        System.out.println(inova.engine );

        Bmw series2 = new Bmw("Turbo", 4, 2, "Q2",true);
        System.out.println(series2.engine+" "+series2.door+" "+series2.name);

        // this is called hierarchical inheritance
        // so one class is inherited by many classes
    }
}
