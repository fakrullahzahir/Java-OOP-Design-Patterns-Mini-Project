import model.AbstractUser;
import model.AdminLoginUser;
import model.CustomerLoginUser;

public class AbstractUserDemo {

    public static void main(String[] args) {

        AbstractUser admin =
                new AdminLoginUser("Ali", "ali@gmail.com");

        AbstractUser customer =
                new CustomerLoginUser("Siti", "siti@gmail.com");

        admin.displayBasicInfo();
        admin.login();

        System.out.println();

        customer.displayBasicInfo();
        customer.login();
    }
}