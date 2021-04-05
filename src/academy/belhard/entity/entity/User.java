package academy.belhard.entity.entity;

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
        if (string.equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}
