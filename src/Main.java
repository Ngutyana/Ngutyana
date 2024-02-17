// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

// Press Shift+F9 to start debugging your code. We have set one breakpoint
// for you, but you can always add more by pressing Ctrl+F8.

// Press Shift+F10 or click the green arrow button in the gutter to run the code.

// Press Alt+Enter with your caret at the highlighted text to see how
// IntelliJ IDEA suggests fixing it.

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        System.out.print("Welcome!! Know more about me below:");

        Details Unathi = new Details("Unathi Ngutyana", "Female",LocalDate.of(1999,10,25));
        System.out.println(Unathi);

        Unathi.setFullname("Unathi Ngutyana");


    }
}
