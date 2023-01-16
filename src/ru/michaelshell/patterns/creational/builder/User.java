package ru.michaelshell.patterns.creational.builder;



public class User {

    Long id;
    String name;
    String email;
    Role role;
    String address;

    public User(Long id, String name, String email, Role role, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.address = address;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        Long id;
        String name;
        String email;
        Role role;
        String address;

        public UserBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }
        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }
        public UserBuilder role(Role role) {
            this.role = role;
            return this;
        }
        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(id, name, email, role, address);
        }

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                ", address='" + address + '\'' +
                '}';
    }
}
