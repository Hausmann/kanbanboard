package de.datev.services.restful.service;

import de.datev.model.Repository;
import de.datev.model.Task;
import de.datev.model.TaskEmpty;
import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/tasks")
public class TaskService {

    @GET
    @Path("/test")
    @Produces({MediaType.APPLICATION_JSON})
    public Response test() {
        Task t = new Task();
        return Response.status(Response.Status.OK).entity(t).build();
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public ArrayList<Task> getAllTasks() {
        return Repository.getTasks();
    }
    
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public Task addNewList(TaskEmpty taskEmpty) {
        ArrayList<Task> repoTasks = Repository.getTasks();
        int taskId = 0;
        if (repoTasks.size() > 0) {
            taskId = repoTasks.get(repoTasks.size() - 1).getId();
        }

        Task newTask = new Task(taskId+1, taskEmpty.getName(), taskEmpty.getDescription(), taskEmpty.getListId());
        Repository.getTasks().add(newTask);

        return newTask;
    }
}
