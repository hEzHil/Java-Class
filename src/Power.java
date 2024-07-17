import java.util.Scanner;

public class Power {
    void sumOfPower(){
        int num =2;
        int og = num;
        int ans =0;
        for(int i=1;i<8;i++){
            ans = og * num;
            System.out.println(ans);
            og = ans;
        }
    }
    void sumOfPower2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter power : ");
        int power = in.nextInt();
        System.out.println("Enter base  value : ");
        int base = in.nextInt();
        if(power % base ==0){
            System.out.println(power +" is power of "+ base);
        }
        else {
            System.out.println("not a power of "+base);
        }
    }
}
