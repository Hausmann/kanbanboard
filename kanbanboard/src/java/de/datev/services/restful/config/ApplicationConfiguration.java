package de.datev.services.restful.config;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class ApplicationConfiguration extends Application {

//    @Override
//    public Set<Class<?>> getClasses() {
//        final Set<Class<?>> classes = new HashSet<>();
//        // register root resource
//        classes.add(ListService.class);
//        classes.add(TaskService.class);
//        return classes;
//    }
}
