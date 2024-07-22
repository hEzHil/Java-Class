package Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class AList {
    void  arrayList(){
        ArrayList<Integer>  arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(50);
        arrayList.add(80);
        arrayList.set(0,1000);
        arrayList.remove(2);
        System.out.println(arrayList);
        System.out.println(arrayList.contains(30));
    }
    void multiAl(){
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> mul = new ArrayList<>();

        // initialization list . that means you are creating individual list for object like
        //  [ [    ] ,  --> in a List this is creating  a new list or initializing it
        //    [    ],
        //    [    ]
        //           ]
        for(int i = 0; i < 3 ; i++ ){
            mul.add(new ArrayList<>());
        }

        // add elements to the individual list
        for(int i = 0; i < 3; i++ ){
            for(int j = 0; j < 3; j++){
                mul.get(i).add(in.nextInt());
            }
        }
        System.out.println(mul  );
    }
     ArrayList<Integer> duplicates(int[] arr) {
        // code here
        ArrayList<Integer> arrList = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arrList.add(arr[j]);
                }
            }
        }
        if(arrList.get(0) <= 0){
            arrList.add(-1);
        }
        return arrList;
    }
}
