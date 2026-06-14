package builder;

import model.User;

public class UserBuilder {

    private String name;
    private String email;
    private String phone;
    private String city;

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public UserBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public User build() {
        return new User(
                name,
                email,
                phone,
                city
        );
    }
}