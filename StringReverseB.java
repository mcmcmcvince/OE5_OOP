public class StringReverseB
 {
    public String reverseString(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        return rev;
    }
    public static void main(String[] args) {
        StringReverseB s=new StringReverseB();
        System.out.println(s.reverseString("Good morning, Mr. Elmer! "));
    }
}
