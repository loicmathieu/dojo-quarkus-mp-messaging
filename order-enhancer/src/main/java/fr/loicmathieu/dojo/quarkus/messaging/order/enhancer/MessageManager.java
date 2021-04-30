package fr.loicmathieu.dojo.quarkus.messaging.order.enhancer;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class MessageManager {
    private static final Logger LOGGER = LoggerFactory.getLogger(MessageManager.class);
    @Inject UserService userService;

    @Incoming("orders")
    @Outgoing("enhanced-orders")
    public EnhancedOrder enhance(Order order){
        LOGGER.info("Receive order: " + order);
        EnhancedOrder enhancedOrder = new EnhancedOrder();
        enhancedOrder.nbItem = order.nbItem;
        enhancedOrder.shippingAddress = order.shippingAddress;
        enhancedOrder.totalPrice = order.totalPrice;
        enhancedOrder.userId = order.userId;
        User user = userService.getUser(order.userId);
        enhancedOrder.userFirstName = user.firstName;
        enhancedOrder.userLastName = user.lastName;
        return enhancedOrder;
    }
}
