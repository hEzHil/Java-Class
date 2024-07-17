package String;

public class SB {
    public static void main(String[] args){
        // StringBuilder will append the values in the already existing object it will not create new object while appending
        StringBuilder build = new StringBuilder();
        for(int i =0;i<26;i++){
            char ch = (char)('a' + i);
            build.append(ch);
        }
        System.out.println(build);
        build.reverse();
        System.out.println(build);
    }
}
