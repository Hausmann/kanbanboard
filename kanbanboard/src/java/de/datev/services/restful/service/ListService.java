package de.datev.services.restful.service;

import de.datev.model.Repository;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import de.datev.model.Task;
import de.datev.model.TaskList;
import de.datev.model.TaskListEmpty;
import java.util.ArrayList;
import javax.ws.rs.Consumes;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;

/**
 * REST-Service für Kanban-Board
 */
@Path("/lists")
public class ListService {
    
    
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public ArrayList<TaskList> getAllLists(){
        return Repository.getTaskLists();
    }
    
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public TaskList addNewList(TaskListEmpty taskListEmpty){
        ArrayList<TaskList> repoList = Repository.getTaskLists();
        int lastId = repoList.get(repoList.size()-1).getListId();
        
        TaskList newList = new TaskList(lastId+1,taskListEmpty.getName());
        Repository.getTaskLists().add(newList);
                      
        return newList;        
    }
    
    
    

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
