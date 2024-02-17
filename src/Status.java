import java.time.LocalDate;

class Status extends Details {

    String status = "Single";

    public Status(String fullname, String gender, LocalDate dob) {
        super(fullname, gender, dob);
    }


    public void main() {
        System.out.print(status);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

