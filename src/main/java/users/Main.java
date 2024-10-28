package users;

public class Main {
    public static void main(String[] args) {
    User user1 = new User("Leandra", "Garcia");
    User user2 = new User("Leopoldo", "Sanz")
    User user3 = new User("Ana", "Beana")

            User[] users = {user1, user2, user3};
    for (User user : users)
        System.out.println(user1.fullname());
    }
}
