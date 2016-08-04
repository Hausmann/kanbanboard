/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.datev.services.restful.service;

import de.datev.model.Repository;
import de.datev.model.Task;
import de.datev.model.TaskList;
import de.datev.model.TaskListEmpty;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author TG00029
 */
@Path("/tasks")
public class TaskService {

    @GET
    @Path("/test")
    @Produces({MediaType.APPLICATION_JSON})
    public Response test() {
        Task t = new Task();
        return Response.status(Response.Status.OK).entity(t).build();
        //return t;
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public ArrayList<Task> getAllTasks() {
        return Repository.getTasks();
    }

}
