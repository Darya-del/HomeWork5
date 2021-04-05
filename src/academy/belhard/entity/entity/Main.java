package academy.belhard.entity.entity;

public class Main {

    public static void main(String[] args) {

      User user1 = new User("Tom", "Hardy", "tom@hardy.com", "Tommy");

        System.out.println(user1.getFullInfo());
        System.out.println(user1.getFullName());
        System.out.println(user1.isPasswordCorrect("Tommy"));

    }
}
