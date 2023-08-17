package SevalTask;

public class Welcome {
    Welcome(){
        System.out.println("Welcome Guest");
    }
    Welcome(String name){
        System.out.println("Welcome "+ name);
    }

    public static void main(String[] args) {
       Welcome wel = new Welcome();
       Welcome we = new Welcome("Ezhil");

    }
}
