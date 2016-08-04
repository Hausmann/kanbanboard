package de.datev.model;

import java.util.ArrayList;

public class Repository {
    
    private static ArrayList<Task> tasks = new ArrayList<Task>();
    private static ArrayList<TaskList> taskLists = new ArrayList<TaskList>();

    public static ArrayList<Task> getTasks() {
        return tasks;
    }

    public static ArrayList<TaskList> getTaskLists() {
        return taskLists;
    }
    
    
    
    private Repository(){}
}
