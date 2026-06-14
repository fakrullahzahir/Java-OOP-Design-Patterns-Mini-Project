package model;

public class CustomerLoginUser extends AbstractUser {

    public CustomerLoginUser(String name, String email) {
        super(name, email);
    }

    @Override
    public void login() {
        System.out.println(name + " login using email and password.");
    }
}