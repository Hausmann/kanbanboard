/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.kboard.api;

import de.kboard.api.beans.Task;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import jdk.net.SocketFlow;

/**
 *
 * @author TG00028
 */
@ApplicationPath("/kboard/")
public class BoardResfullService extends Application {

    @GET
    @Path("lists")
    @Produces({MediaType.APPLICATION_JSON})    
    public ArrayList<Task> getAllTask(){
        return new ArrayList<Task>();
    }
    
}
