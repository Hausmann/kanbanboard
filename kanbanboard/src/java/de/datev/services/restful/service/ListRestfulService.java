package de.datev.services.restful.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import de.datev.model.KanbanListModel;

/**
 * REST-Service für Kanban-Board
 */
@Path("lists/")
public class ListRestfulService {

    /**
     * gibt alle Listen zurück
     *
     * @return alle Einkaufslisten
     */
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
        KanbanListModel result = new KanbanListModel(0, "dummy List", "dummy List");
        //return Response.status(Response.Status.OK).entity(result).build();
        return Response.status(Response.Status.OK).build();
    }

}
