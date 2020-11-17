package fr.loicmathieu.dojo.quarkus.messaging.search.kafka;

import fr.loicmathieu.dojo.quarkus.messaging.search.EnhancedOrder;
import io.quarkus.kafka.client.serialization.JsonbDeserializer;

public class EnhancedOrderDeserializer extends JsonbDeserializer<EnhancedOrder> {
    public EnhancedOrderDeserializer() {
        super(EnhancedOrder.class);
    }
}
