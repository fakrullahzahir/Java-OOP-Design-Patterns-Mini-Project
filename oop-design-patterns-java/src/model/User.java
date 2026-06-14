package model;

public class User {

    private String name;
    private String email;
    private String phone;
    private String city;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User(String name, String email, String phone, String city) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Invalid email format.");
        }
    }

    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("City : " + city);
    }
}