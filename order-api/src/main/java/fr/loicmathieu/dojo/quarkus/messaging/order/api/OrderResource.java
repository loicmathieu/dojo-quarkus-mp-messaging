package fr.loicmathieu.dojo.quarkus.messaging.order.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class OrderResource {
    @POST
    public void create(Order order){
        //TODO send the order to an 'orders' channel using an Emitter
    }
}
