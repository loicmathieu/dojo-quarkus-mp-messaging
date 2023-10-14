package fr.loicmathieu.dojo.quarkus.messaging.search;

import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EnhancedOrderService {
    private static List<EnhancedOrder> ORDER_DB = new ArrayList<>();

    public void add(EnhancedOrder enhancedOrder) {
        ORDER_DB.add(enhancedOrder);
    }

    public List<EnhancedOrder> searchAll(){
        return ORDER_DB;
    }
}
