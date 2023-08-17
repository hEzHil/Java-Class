package Inheritance2;

class Rectangle {

    int length ;
    int breadth ;
    static void areaOfRectangle(int width,int height){
        int area = width * height;
        System.out.println("Area of Rectangle is : "+area);
    }
    static void perimeterOfRectangle(int length,int breadth){
        int perimeter = 2 *(length + breadth);
      System.out.println("Perimeter of Rectangle is : "+ perimeter);
    }
}
class Main{
    public static void main(String[] args) {
        Rectangle a = new Rectangle();
        a.areaOfRectangle(10,2);
        a.perimeterOfRectangle(20,10);
    }

}
