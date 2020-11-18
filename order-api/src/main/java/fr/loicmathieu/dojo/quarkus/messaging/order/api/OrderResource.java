package fr.loicmathieu.dojo.quarkus.messaging.order.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
