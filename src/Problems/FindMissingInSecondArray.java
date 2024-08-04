package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindMissingInSecondArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 10};
        int[] b = {2, 3, 1, 0, 5};

        System.out.println(findMissing(a,b));



    }
    static ArrayList<Integer> findMissing(int[] a, int[] b){
        HashSet<Integer> setB = new HashSet<>();
        for(int num : b){
            setB.add(num);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int num : a){
            if(!setB.contains(num)){
                list.add(num);
            }
        }
        return list;
    }
}
