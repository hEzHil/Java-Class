package Inheritance;

class  Animal {
    int nolegs=4;
    public static void eat() {
        System.out.println("I am eating");
    }
    public static void walk(){
        System.out.println("I am walking");
    }
    }
    class dog extends Animal{
    Boolean canbark=true;



    }
    class call{
        public static void main(String[]args){

        dog obj1=new dog();
        System.out.println(obj1.canbark);
        System.out.println(obj1.nolegs);
        obj1.eat();
        obj1.walk();
        }
    }



