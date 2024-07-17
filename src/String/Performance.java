package String;

public class Performance {
    public static void main(String[] args) {
        // String will create new object for every iteration and it is really poor performance
        String series ="";
        for(int i =0;i<26;i++){
            char ch = (char)('a' +i);
            series += ch;
        }
        System.out.println(series);
    }

}
