public class replacingText {
    public static void main(String[] args)
    {
        String myText = "Find my name : unknown, UNKNOWN";
        System.out.println(myText.replace("unknown","Unathi"));

        //NB: the replace is case sensitive, only applies to replace the exact name and cases.
        //It considers upper case and lower case to be different strings.
    }
}