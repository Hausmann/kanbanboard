package de.datev.services.restful.service;

import de.datev.model.Repository;
import de.datev.model.Task;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import de.datev.model.TaskList;
import de.datev.model.TaskListEmpty;
import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;

@Path("/lists")
public class ListService {
//
//    @GET
//    @Path("/test")
//    @Produces({MediaType.APPLICATION_JSON})
//    public TaskListEmpty test() {
//        return new TaskListEmpty("testList");
//    }

    @GET
    @Path("/{listId}")
    @Produces({MediaType.APPLICATION_JSON})
    public ArrayList<Task> getTasksByListId(@PathParam("listId") int listId){
        ArrayList<Task> tasks = Repository.getTasks();
        
        ArrayList<Task> taksFromThisList = new ArrayList();
        
        for(Task task:tasks){
            if(task.getListId()==listId){
                taksFromThisList.add(task);
            }
        }
        
        return taksFromThisList;        
    }
    
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public ArrayList<TaskList> getAllLists() {
        return Repository.getTaskLists();
    }

    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public TaskList addNewList(TaskListEmpty taskListEmpty) {
        ArrayList<TaskList> repoList = Repository.getTaskLists();
        int lastId = 0;
        if (repoList.size() > 0) {
            lastId = repoList.get(repoList.size() - 1).getListId();
        }

        TaskList newList = new TaskList(lastId + 1, taskListEmpty.getName());
        Repository.getTaskLists().add(newList);

        return newList;
    }
}