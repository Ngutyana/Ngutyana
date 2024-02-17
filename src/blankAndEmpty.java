public class blankAndEmpty {
    public static void main(String[] args)
    {
        String myText = "";
        //isEmpty specifies that the length of the text has o characters; so it is empty.
        //Will provide a boolean 'true' if there is no space(no character) because the isEmpty is a confirmation.
        // NB: A space is a character, it also has a code associated with it.
        System.out.println(myText.isEmpty());


        String myText2 = " ";
        System.out.println(myText2.isBlank());
        //Will return a "true" because there is a white/plain space which means its blank, NOT empty.
        //No space is also considered to be a blank string.
        //When a character is inserted it will return "false", because it is not a blank space anymore.
    }
}
