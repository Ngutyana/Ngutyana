public class alphabeticOrder {
    public static void main(String[] args) {
        String word = "Computer";
        String word2 = "cable";

        System.out.println(word.compareTo(word2));
        System.out.println(word.compareToIgnoreCase(word2));
        System.out.println(compareToIgnoreCase(word,word2));
    }


    public static int compareToIgnoreCase(String text1, String text2){
        return text1.compareToIgnoreCase(text2);
    }
}
//If the first string is equal to the second string, the return output will be 0
//If the first string comes before the second string, the return output will be negative
//If the first string comes after the second string, the return output will be positive
