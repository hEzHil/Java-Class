package packages.task;
import java.util.Arrays;
public class MiniSwap {
    public static void main(String[] args) {
        int[] num={10, 19, 6, 3, 5};
        int[] n =new int[num.length];
        for(int i=0;i<num.length;i++){
            n[i] = num[i];

        }
        Arrays.sort(num);
        for(int i=0;i<num.length;i++){
                if(num[i]!=n[i]){
                    System.out.println(n[i]+" "+num[i]);
                }

        }

    }
}
