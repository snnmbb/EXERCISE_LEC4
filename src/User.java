import java.security.PublicKey;
import java.time.LocalDate;

public class User {
    private String name;
    private LocalDate dob;

    protected void doSomething() {
        System.out.println("Hello " + this.name + "who was born in " + this.dob + "!");
    }

    public User() {
        this.name = null;
        this.dob = LocalDate.now();
    }

    public User(String name, int year, int month, int date) {
        this.name = name;
        this.dob = LocalDate.of(year, month, date);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return this.dob;
    }

    public void setDob(int year, int month, int date) {
        this.dob = LocalDate.of(year, month, date);
    }
}
