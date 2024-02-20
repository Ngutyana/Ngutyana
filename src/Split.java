public class Split {
    public static void main(String[] args) {
        String myText = """
                Unathi,Ngutyana,1999,Butterworth
                Lizeka,Voko,1997,Sterkspruit
                Saabirah,Abrahams,2002,Cape Town
                Stuart,Stuurman,1998,Plettenberg Bay
                Zikho,Obrian,1998,Qonce
                """;

        String[] myPeople = myText.split("\n");   //Splitting the string according to \n (next line)
        System.out.println(myPeople.length);  //Calculating the number of records in the data vertically
        System.out.println(myPeople[0]);  //printing an output of the inserted array record

        String[] data = myPeople[0].split(","); //Splitting the data using ","
        System.out.println(data[3]);  //Using the split to navigate to the data record you want

    }
}
