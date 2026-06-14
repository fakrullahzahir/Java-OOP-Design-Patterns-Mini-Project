package model;

public class AdminUser extends User {
    public AdminUser(String name, String email) {
        super(name, email);
    }

    @Override
    public void displayInfo() {
        System.out.println("Admin User: " + getName() + " | " + getEmail());
}
    public void manageSystem() {
        System.out.println(getName() + " is managing the system.");
    }

    
}