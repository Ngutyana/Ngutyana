public class comparingStrings {
    public static void main(String[] args) {
        String text = "Oranges";
        String text2 = "Oranges";

        System.out.println(text.contentEquals(text2));  //This method is used to VERIFY whether the string's content are equal.

        boolean result = text.contentEquals(text2); //the boolean will PRINT whether the inputs are true or false
        System.out.println(result);

    }
}
