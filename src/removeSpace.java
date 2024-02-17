public class removeSpace {
    public static void main(String[] args) {
        String firstName = "   Unathi  ";
        System.out.format("'%s'", firstName.strip()); //a strip() method removes the spaces
        System.out.format("'%s'", firstName.stripLeading()); //a stripLeading() method removes leading spaces
        System.out.format("'%s'", firstName.stripTrailing()); //a stripTrailing() method removes trailing spaces

//No.2
        String fullNames = """
                Unathi
                 Ngutyana
                   Mambhele
                Khuboni
                """;  //in Java, 3 quotation marks are used to write a string in different lines.

        System.out.print(fullNames.stripIndent()); //a stripIndent() method removes spaces relatively

//N0.3

        String Name = "   Unathi  ";
        System.out.format("'%s'", Name.trim()); //a trim() method removes the spaces just like strip()


//No.4
        String name = "   Unathi  ";
        System.out.format("'%s'", split(name)); //a trim() method removes the spaces just like strip()
    }

    public static String split(String name)
    {
 //No.4
        return name.replace(" ","");
    }

}

