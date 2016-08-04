package de.datev.services.restful.service;

import de.datev.model.KanbanBoardModel;
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
import javax.ws.rs.Consumes;

import de.datev.model.KanbanListModel;

/**
 * REST-Service für Kanban-Board
 */
@Path("lists/")
public class ListRestfulService {

    public static KanbanBoardModel kanbanboard = new KanbanBoardModel();
    /**
     * gibt alle Listen zurück
     *
     * @return alle Einkaufslisten
     */
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getLists() {
        return Response.status(Response.Status.OK).entity(kanbanboard.GetArrayListOfTaskLists()).build(); 
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response createNewList(String name){
        kanbanboard.AddNewList(name);
        
        return Response.status(Response.Status.OK).entity(kanbanboard.GetArrayListOfTaskLists()).build();
    }
    /**
     * Selektiert eine Liste
     *
     * @param ListId der zu selektierenden Liste
     */
    //Beispielabfrage: /kanbanboard/lists/0
    @GET
    @Path("{listID}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getList(@PathParam("listID") int ListId) {
        KanbanListModel result = kanbanboard.GetListByID(ListId);
        
        return Response.status(Response.Status.OK).entity(result).build();
    }
}
