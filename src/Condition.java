import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
     Condition multi = new Condition();
     multi.multipleIf();


    }

    void ifCondition(){
        Scanner in = new Scanner(System.in);
        int salary = in.nextInt();
        if(salary > 10000){
            salary = salary + 2000;
        }
        else{
            salary += 1000; // salary = salary + 1000 only
        }
        System.out.println(salary);
    }

    void multipleIf(){
        System.out.println("Enter a salary:");
        Scanner in = new Scanner(System.in);
        int salary = in.nextInt();
        if(salary > 20000){
            salary += 3000;
        } else if (salary > 10000) {
            salary += 2000;
        }
        else{
            salary += 1000;
        }
        System.out.println(salary);
    }
}
