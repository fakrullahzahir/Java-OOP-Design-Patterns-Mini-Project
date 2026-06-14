import builder.UserBuilder;
import model.User;

public class Main {

    public static void main(String[] args) {

        User user = new UserBuilder()
                .setName("Fakrul")
                .setEmail("fakrul@gmail.com")
                .setPhone("0123456789")
                .setCity("Shah Alam")
                .build();

        user.displayInfo();
    }
}