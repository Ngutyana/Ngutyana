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

        //No 4
        System.out.println("Adding a concat with manual text".concat(text1)); //adding a concatenation on a manual text

        //No 5
        System.out.println(text1.concat("Adding manual")); //Adding manual text within the concat method

        //No 6 -------- Mostly used when you may need to include a loop
        String testingString = new StringBuilder().append(text1).append(text2).toString(); //Using an append and string bulider add text
        System.out.println(testingString);

        //OR

        String testingString2 = text1 + text2;
        System.out.println(testingString2);

        //-----How to add space ---------
        String testingString3 = new StringBuilder(text1.length() + text2.length() +1)
                .append(text1)
                .append(" ")            //space added
                .append(text2)
                .toString();
        System.out.println(testingString3);

        //OR

        String testingString4 = text1
                +" "                   //Space added
                + text2;
        System.out.println(testingString4);

        //No 7 {Using a string buffer, exactly the same as a builder but older.}
        String testingString5 = new StringBuffer()
                .append(text1)
                .append(" ")            //space added
                .append(text2)
                .toString();
        System.out.println(testingString5);

        //No 7
        System.out.format("%s %s",text1,text2); //A format is the shortest way to combine string

        //No 8
        String lastExample = String.format("%s %s",text1,text2);
        System.out.println(lastExample);


    }
}
