package packages.properties.inheritance;

public class box {
    double l;
    double h;
    double w;

    box(){
        this.h= -1;
        this.l= -1;
        this. w =-1;
    }

    box(double size){
        this.l = size;
        this.h = size;
        this.w = size;
    }

    box(double l , double h, double w ){
        this.l = l;
        this.h = h;
        this.w = w;

    }

}
