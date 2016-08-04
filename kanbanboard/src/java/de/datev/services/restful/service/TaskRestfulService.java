/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import de.datev.model.TaskItemEmpty;
import de.datev.model.TaskItemModel;
import de.datev.services.restful.service.ListRestfulService;
import static de.datev.services.restful.service.ListRestfulService.kanbanboard;

/**
 *
 * @author TG00026
 */
@Path("lists/{listID}/tasks/")
public class TaskRestfulService {
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getLists(@PathParam("listID") int listID ) {
        return Response.status(Response.Status.OK).entity(kanbanboard.GetListByID(listID).getTasks()).build(); 
    }
    
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response createNewList(@PathParam("listID") int listID, TaskItemEmpty emptyTask){
        kanbanboard.GetListByID(listID).AddNewTask(emptyTask.getAssignedTo(), emptyTask.getDescription());
        
        return Response.status(Response.Status.OK).entity(kanbanboard.GetListByID(listID).getTasks()).build();
    }
    
    
    @GET
    @Path("{taskID}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getList(@PathParam("listID") int ListId, @PathParam("taskID") int taskID) {
        TaskItemModel result = kanbanboard.GetListByID(ListId).GetTaskByID(taskID);
        
        return Response.status(Response.Status.OK).entity(result).build();
    }
}
