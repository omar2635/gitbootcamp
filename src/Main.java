public class Main {

    public static void main(String[] args) {
        String myUsername = "omar2635";
        String myPassword = "Walid";

        if(!User.validateUsername(myUsername)) {
            System.out.println("Username doesn't fit the rules. Please check the User class.");
        } else {
            User u = new User(myUsername, User.hashPassword(myPassword));
            System.out.println(u);
        }
    }
}
