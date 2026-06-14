package model;

public class CustomerUser extends User {
    public CustomerUser(String name, String email) {
        super(name, email);
    }

     @Override
    public void displayInfo() {
        System.out.println("Customer User: " + getName() + " | " + getEmail());
    }

    public void placeOrder() {
        System.out.println(getName() + " placed an order.");
    }
}