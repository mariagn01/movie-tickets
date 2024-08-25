package webprog.movietickets;

//POJO class for the ticket-object, with constructor and getters/setters
public class Ticket {
    private String movie;
    private String amount;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;

    public Ticket(String movie, String amount, String firstname, String lastname, String phone, String email) {
        this.movie = movie;
        this.amount = amount;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
    }

    public Ticket() {}

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
