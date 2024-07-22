package Problems;

import java.util.Scanner;

public class InrToUsd {
      //Input currency in rupees and output in USD.
    void exchange(){
        float usdExchange = 83.56f;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Indian rupee :");
        float rupee = in.nextFloat();
        float usd = rupee / usdExchange;
        System.out.println("USD :" + usd);
    }
}
