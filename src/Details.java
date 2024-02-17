import java.time.LocalDate;

public class Details {
    private String fullname;
    private String gender;
    private LocalDate dob;
    private Status status;
    private Qualification qualifications;


    public Details(String fullname, String gender, LocalDate dob) {
        this.fullname = fullname;
        this.gender = gender;
        this.dob = dob;

    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}

