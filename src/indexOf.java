public class indexOf {
    public static void main(String[] args) {

        String myText = "Finding An index in A longer string";

        //Index specifies the position of the first character input of the string
        System.out.println(myText.indexOf("index"));

        //The index can also do a search using alphabetic code numbers
        System.out.println(myText.indexOf(65)); //65 is a code number for capital letter "A"

        //NOTE: if a char or int input doesn't exist on the variable string, the return will "-1"


        //Using last index search
        System.out.println(myText.lastIndexOf("i"));
        System.out.println(myText.lastIndexOf(65));

        //searching for the first char of "i" starting from index 4
        System.out.println(myText.indexOf("i", 4));


//Example on how to use an index

        String phoneNumber = "(021) 982-1283";
        String areaCode = parseAreaCode(phoneNumber);
        String exchange = parseExhange(phoneNumber);
        String lineNumber = parseLineNumber(phoneNumber);

        System.out.println(areaCode);
        System.out.println(exchange);
        System.out.println(lineNumber);

    }

    public static String parseAreaCode(String phoneNumber){
        int open = phoneNumber.indexOf("(");
        int close = phoneNumber.indexOf(")");
        String areaCode = phoneNumber.substring(open+1, close);
                return areaCode;

    }
    public static String parseExhange(String phoneNumber){
        int space = phoneNumber.indexOf(" ");
        int dash = phoneNumber.indexOf("-");
        String exchange = phoneNumber.substring(space+1, dash);
        return exchange;

    }
    public static String parseLineNumber(String phoneNumber){
        int hyphen = phoneNumber.indexOf("-");
        String lineNumber = phoneNumber.substring(hyphen+1);
        return lineNumber;
    }
}
