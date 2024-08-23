package Oops.Generic;

public class FunExample {
    public static <T> int count (T arr[], T x){
        int res = 0;
        for (T e : arr) {
            if(e.equals(x)){
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Integer arr[] = {10,20,30,10,40};
//        Integer x = 10;
        System.out.println(count(arr, 10));
    }
}
