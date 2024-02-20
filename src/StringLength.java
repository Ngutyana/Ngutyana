public class StringLength {
     public static void main(String[] args) {
         String myText = "Trying out a lengthy string";
         System.out.println(myText.length());  //Printing the length of the string

         char[] chars = myText.toCharArray();
         System.out.println(chars[5]); //Determining the index of the characters in a string


         String output = "Exceeded!!";
         int index = 10;

         //Using a conditions
         if(index <= myText.length())
         {
             System.out.println(chars[index]);
         }
         else {
             System.out.println(output);
         }


         //No. 2

         String myText2 = "Three";
         String myText3 = "Numbers";
         //A string builder is used to reduce memory usage
         StringBuilder build = new StringBuilder(myText2.length() + myText3.length())
                 .append(myText2)
                 .append(myText3);
         System.out.println(build.toString());



    }
}
