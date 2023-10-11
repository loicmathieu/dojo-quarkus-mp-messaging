package fr.loicmathieu.dojo.quarkus.messaging.search;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
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
