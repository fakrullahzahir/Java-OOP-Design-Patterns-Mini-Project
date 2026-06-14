package model;

public abstract class AbstractUser {

    protected String name;
    protected String email;

    public AbstractUser(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public abstract void login();

    public void displayBasicInfo() {
        System.out.println("Name : " + name);
        System.out.println("Email: " + email);
    }
}