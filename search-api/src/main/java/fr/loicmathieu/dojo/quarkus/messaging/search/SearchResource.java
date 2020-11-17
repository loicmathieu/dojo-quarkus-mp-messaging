package fr.loicmathieu.dojo.quarkus.messaging.search;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SearchResource {

    @Inject
    EnhancedOrderService enhancedOrderService;

    @GET
    public List<EnhancedOrder> list() {
        return enhancedOrderService.searchAll();
    }
}
