package fr.loicmathieu.dojo.quarkus.messaging.order.enhancer;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;
import io.smallrye.reactive.messaging.connectors.InMemoryConnector;

import java.util.Map;

public class InMemoryChannelTestResource implements QuarkusTestResourceLifecycleManager {

    @Override
    public Map<String, String> start() {
        InMemoryConnector.switchIncomingChannelsToInMemory("orders");
        InMemoryConnector.switchOutgoingChannelsToInMemory("enhanced-orders");
        return Map.of();
    }

    @Override
    public void stop() {
        InMemoryConnector.clear();
    }

}
