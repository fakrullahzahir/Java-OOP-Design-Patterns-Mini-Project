public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Invalid email format.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}