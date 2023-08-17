package packages.task;
import java.util.ArrayList;

import java.util.Collections;

public class SumOfMiddelNo {
    public static void main(String[] args) {

        int[] n1 ={1, 2, 4, 6, 10};
        int[] n2 ={4, 5, 6, 9, 12};
        ArrayList<Integer> Al = new ArrayList<>();
        for(int i=0;i<n1.length;i++){
            Al.add(n1[i]);
        }
        for(int i=0;i<n2.length;i++){
            Al.add(n2[i]);
        }

        Collections.sort(Al);
        int a,b,x;
        if(Al.size() % 2==0){
             a = Al.size() / 2;
             b = (Al.size() / 2 ) -1;

             x = Al.get(a) + Al.get(b);

             System.out.println(x);

        }
        System.out.println(Al);

    }
}
