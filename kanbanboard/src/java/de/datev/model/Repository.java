package de.datev.model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonWriter;

public class Repository {
    
    private final static String path = "./data.json";
    
    private static ArrayList<Task> tasks = new ArrayList<Task>();
    private static ArrayList<TaskList> taskLists = new ArrayList<TaskList>();

    public static ArrayList<Task> getTasks() {
        
        saveChanges();
        
        return tasks;
    }

    public static ArrayList<TaskList> getTaskLists() {
        saveChanges();
        
        return taskLists;
    }

    private static void saveChanges() {
        FileOutputStream out;
        try {
            out = new FileOutputStream(path);
            JsonWriter writer = Json.createWriter(out); 
            //writer.write(tasks);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    private Repository(){}
}
