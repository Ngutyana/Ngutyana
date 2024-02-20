public class subStrings
{
    public static void main(String[] args) {
        String myText = "apple";
        String myText2 = myText.substring(1); //The string will be read from [1] position == "pple"
        String myText3 = myText.substring(0, 3); //The string will read starting from[0] character and stops at (3rd) inserted char of the string == "app"
        String myText4 = myText.substring(0, 1).toUpperCase(); //Making the [0] character and uppercase

        System.out.println(myText4.concat(myText2)); //Concating caps "A" with small letter "pple" to print "Apple"

        System.out.println(myText.substring(0, 1).toUpperCase() + myText.substring(1, 4)+ myText.substring(4).toUpperCase());
    }
}
