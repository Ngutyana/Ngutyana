public class subStrings
{
    public static void main(String[] args) {
        String myText = "apple";
        String myText2 = myText.substring(1); //The string will be read from [1] position == "pple"
        String myText3 = myText.substring(0, 3); //The string will read starting from[0] character and stops at (3rd) inserted char of the string == "app"
        String myText4 = myText.substring(0, 1).toUpperCase(); //Making the [0] character and uppercase

        System.out.println(myText4.concat(myText2)); //Concating caps "A" with small letter "pple" to print "Apple"

        System.out.println(myText.substring(0, 1).toUpperCase()
                + myText.substring(1, 4)
                + myText.substring(4).toUpperCase());

        //Using a string builder to append
        String build = new StringBuilder(myText4.length() + myText2.length())
                .append(myText4)
                .append(myText2)
                .toString();
        System.out.println(build);


        //Note: other ways to validate the length through a string builder
        int capacity = myText3.length();
        String  length  = new StringBuilder(capacity).append(myText3).toString();
        System.out.println(length);




        //Example on how to use a substring

        String phoneNumber = "(047) 224-1999";

        String areaCode = phoneNumber.substring(1, 4);
        String exchange = phoneNumber.substring(6);
        String append = exchange.substring(0, 3);
        String lineNumber = phoneNumber.substring(10);


        System.out.println("An area code is :" +areaCode);
        System.out.println("An exchange code is :" +append);
        System.out.println("A line number is :" +lineNumber);

        System.out.println("("+areaCode+") "+append+"-"+lineNumber);


    }
}
