public class BeginningAndEndingOfString {
    public static void main(String[] args) {
        String text = "Unathi_Ngutyana";

        System.out.println(text.endsWith("ana")); //Verifies that the string ends with Ngutyana, searches characters from the end
        System.out.println(text.startsWith("Una")); //Verifies that the string starts with Unathi, searches characters from the beginning

//Note: Space matters
        String testSpace = "  Spacing-test";

        //Clearing the space using "replace()"
        String clearSpace = testSpace.replace(" ","");
        System.out.println(clearSpace.startsWith("Spacing"));

        //Clearing the space using a "Strip()"
        System.out.println(testSpace.strip().startsWith("Spacing"));
    }
}
