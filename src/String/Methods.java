package String;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args){
        String name = "Ezhil";

        // It will print each character in array
        System.out.println(Arrays.toString(name.toCharArray()));
        // in this method we change  each  charter & it will create new object it won't change the real  object
        //for example line 14
        System.out.println(name.replace('E','M'));
        System.out.println(name);

        // it will make the all the characters to lower case
        System.out.println(name.toLowerCase());
    }
}
