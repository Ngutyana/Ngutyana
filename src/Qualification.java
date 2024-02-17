import java.time.LocalDate;

public class Qualification extends Details {
    String Diploma = "Diploma in Software Development";
    String AdvDiploma = "Advanced Diploma in Multimedia Application";
    String PGradDiploma = "Post Graduate Diploma in Application Development";

    public Qualification(String fullname, String gender, LocalDate dob) {
        super(fullname, gender, dob);
    }


    public void Qual()
    {
        System.out.println("Obtained Qualifications are: /n" + Diploma + "/n" + AdvDiploma + "/n" + PGradDiploma);
    }

}
