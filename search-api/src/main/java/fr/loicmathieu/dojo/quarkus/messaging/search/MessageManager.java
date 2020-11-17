package fr.loicmathieu.dojo.quarkus.messaging.search;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class MessageManager {
    @Inject
    EnhancedOrderService enhancedOrderService;

    //TODO listen to the 'enhanced-orders' channel and add the enhanced order to the DB via the enhancedOrderService
}
