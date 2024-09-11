package Problems;

public class UniqueChar {
    public static String uniqueChar(String str){
        int[] arr = new int[256];
        for(int i =0; i < str.length(); i++){
            // count freq of the characters present in the str
            char ch = str.charAt(i);
            arr[ ch - 'a']++;
        }
        String str1 = "";
        for(int i =0; i < 256; i++){
            if(arr[i] ==1){
                str1 = str1 + ((char) (i + 'a'));
            }
        }
        return str1;
    }
    public static void main(String[] main){
        String str = "ppdfs";
        String ans = uniqueChar(str);

        if(ans.length() == 0){
            System.out.println("No unique characters. ");
        }
        else {
            System.out.println("Unique Characters are : ");
            for (int i = 0; i < ans.length(); i++) {
                System.out.println(ans.charAt(i));
            }
        }
    }
}
