package academy.belhard;

public class User extends Person {

    private String email;
    private String password;

    public User(String firstName, String lastName, String email, String password) {
        super(firstName, lastName);
        this.email = email;
        this.password = password;
    }

    public String getFullInfo() {
        return ("Имя " + firstName + " " + lastName + "\n" + "email " + email);
    }

    public boolean isPasswordCorrect(String string) {
       return string.equals(password);
    }
}
