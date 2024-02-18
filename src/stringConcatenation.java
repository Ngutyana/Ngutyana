public class stringConcatenation
{
    public static void main(String[] args) {
        String text1 = "My first text";
        String text2 = "My second text";

        //No 1
        System.out.println(text1 + text2);

        //No 2
        System.out.println(text1 +" "+ text2); //adding space

        //No 3
        System.out.println(text1.concat(text2)); //adding concat
    }
}
