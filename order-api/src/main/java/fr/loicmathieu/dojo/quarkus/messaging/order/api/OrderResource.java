package fr.loicmathieu.dojo.quarkus.messaging.order.api;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class OrderResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderResource.class);

    @Inject @Channel("orders")
    Emitter<Order> emitter;

    @POST
    public void create(Order order){
        LOGGER.info("Creating order: {}", order);
        emitter.send(order);
    }
}
