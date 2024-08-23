package String.StBufffer;

import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        // What is String Buffer ?
        // It is mutable sequence of characters
        // Mutable objects can be modified after they are created
        // it is thread safety
        // because of thread safety it is slow
        // if i are working with multiple threads and need thread safety then use the StringBuffer
        // if  u are not working with multiple thread and need to fast then use String Builder
        StringBuffer st = new StringBuffer();
        System.out.println(st.capacity());
        st.append(" I ");
        // it will not create a new object
        st.append(" which is nice");
//        so we can insert in mentioning the index
        st.insert(2, " am Ezhil");

        // we can replace it with values in range
        st.replace(6,11,"Mahil");

        // and we can delete also within the range
        st.delete(2,5);
        String str = st.toString();
        System.out.println(str);
        HashSet<Integer> set = new HashSet<>();
        set.add()
    }
}
