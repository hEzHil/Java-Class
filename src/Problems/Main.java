package Problems;

import Problems.FindStartAndEnd;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       FindStartAndEnd findStartAndEnd = new FindStartAndEnd();
       int[] nums = {1,2,4,4,4,4,5,6};
       int target = 4;
      int[] ans =  findStartAndEnd.searchRange(nums, target);
        System.out.println(ans[1]);


        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());
        System.out.println(date); // 06-23-2020

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        List<Integer> mergeList = new ArrayList<>(list1);
        mergeList.addAll(list2);
        System.out.println(mergeList);
    }






    // Problems.Palindrome
   static void palindrome(int a ){

        int temp = a;
        int res=0;
        while(a !=0){
            int rem  = a % 10;
            res =( res * 10 )+rem;
            a = a / 10;
        }
        if ( temp == res ){
            System.out.println("Problems.Palindrome");
        }else {
            System.out.println("Not Problems.Palindrome");
        }
    }
    static String reverseString(String name){

        String str ="";
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            str = ch+str;
        }
        return str;
    }


    // swap
   static void swap( int num1 , int num2 ){
        int temp = num1;
        num1 = num2;
        num2 = temp;

    }
// factorial
    static void factorial(int num){

        int result =1;
        for(int i=2;i<=num;i++){
            result = result * i;
            System.out.println(result);
        }
        System.out.println(result);
    }

    // find the electricityBill for house by calculating the units

    static void electricityBill(){
        System.out.println("Enter the unit: ");
        Scanner in = new Scanner(System.in);
        int unit =in.nextInt();
        int totalBill =0;
        if(unit <= 100){
            totalBill = unit * 10;
        }
        else if(unit <= 200){
            totalBill = (100 * 10) + (unit -100) *15;
        }
        else if(unit <=300){
            totalBill = (100 * 10 ) + (100 * 15) + (unit - 200) *20;
        }
        else if( unit > 300){
            totalBill = (100 * 10) + (100 * 15) + (100 * 20) + (unit -300) * 25;
        }
        System.out.println(totalBill);
    }




}