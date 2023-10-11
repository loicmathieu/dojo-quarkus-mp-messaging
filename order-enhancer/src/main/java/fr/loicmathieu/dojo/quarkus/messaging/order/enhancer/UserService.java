package fr.loicmathieu.dojo.quarkus.messaging.order.enhancer;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.Map;

@ApplicationScoped
public class UserService {
    private static Map<String, User> USER_DB = Map.of(
      "user1", new User("user1", "Loïc", "Mathieu"),
      "user2", new User("user2", "Tom", "Sawyer"),
      "user3", new User("user3", "Huckleberry", "Finn")
    );

    private static User UKNOWN = new User("unknown", "unknown", "unknown");

    public User getUser(String id){
        return USER_DB.getOrDefault(id, UKNOWN);
    }
}
