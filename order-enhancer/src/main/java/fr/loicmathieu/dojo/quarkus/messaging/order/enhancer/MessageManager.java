package fr.loicmathieu.dojo.quarkus.messaging.order.enhancer;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class MessageManager {
    @Inject UserService userService;

    // TODO enhance the order using a method that register to the 'orders' channel and send the enhanced order to the 'enhanced-orders' channel
    // use the userService to get the user and enhance the order with the user info
}
