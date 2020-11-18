package fr.loicmathieu.dojo.quarkus.messaging.order.enhancer.kafka;

import fr.loicmathieu.dojo.quarkus.messaging.order.enhancer.Order;
import io.quarkus.kafka.client.serialization.JsonbDeserializer;

public class OrderDeserializer extends JsonbDeserializer<Order> {

    public OrderDeserializer() {
        super(Order.class);
    }
}
