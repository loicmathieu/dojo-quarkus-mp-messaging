package fr.loicmathieu.dojo.quarkus.messaging.search;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class MessageManager {
    @Inject
    EnhancedOrderService enhancedOrderService;

    @Incoming("enhanced-orders")
    public void record (EnhancedOrder enhancedOrder) {
        enhancedOrderService.add(enhancedOrder);
    }
}
