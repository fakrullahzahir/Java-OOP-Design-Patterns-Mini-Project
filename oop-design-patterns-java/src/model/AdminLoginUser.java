package model;

public class AdminLoginUser extends AbstractUser {

    public AdminLoginUser(String name, String email) {
        super(name, email);
    }

    @Override
    public void login() {
        System.out.println(name + " login using admin credentials.");
    }
}