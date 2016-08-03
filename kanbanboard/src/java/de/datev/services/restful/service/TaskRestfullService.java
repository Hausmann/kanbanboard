package de.datev.services.restful.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import de.datev.model.Task;

/**
 * REST-Service für Kanban-Board
 */
@Path("/tasks")
public class TaskRestfullService {

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getList() {
        
        return Response.status(Response.Status.OK).build();

        //return Response.status(Response.Status.OK).entity(result).build();
        
    }

    /**
     * Selektiert eine Liste
     *
     * @param ListId der zu selektierenden Liste
     */
    //Beispielabfrage: /kanbanboard/lists/0
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getList(@PathParam("id") int ListId) {
        Task result = new Task();
        //return Response.status(Response.Status.OK).entity(result).build();
        return Response.status(Response.Status.OK).build();
    }

}
