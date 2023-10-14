package fr.loicmathieu.dojo.quarkus.messaging.order.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

    @POST
    public void create(Order order){
        LOGGER.info("Creating order: {}", order);
        //TODO send the order to an 'orders' channel using an Emitter
    }
}
