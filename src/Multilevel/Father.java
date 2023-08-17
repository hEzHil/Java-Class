package Multilevel;

 class Grandfather{
    char gender='M';
    void print(){
        System.out.println("Parent class");
    }
}
class father extends Grandfather{

}
class son extends father{

}
class inheritance{
     public static void main(String[]args){
         son s=new son();
         System.out.println(s.gender);
         s.print();
     }
}
