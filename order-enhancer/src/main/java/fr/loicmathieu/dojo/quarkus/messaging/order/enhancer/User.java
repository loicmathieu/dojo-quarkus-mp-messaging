package fr.loicmathieu.dojo.quarkus.messaging.order.enhancer;

public class User {
    public String userId;
    public String firstName;
    public String lastName;

    public User(String userId, String firstName, String lastName) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
