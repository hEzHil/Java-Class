package Problems;

public class ApplForm {
    String name;
    int age;
    public  void display(){
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        ApplForm app = new ApplForm();
        app.name="Ezhil";
        app.age =21;
        app.display();
    }
}
