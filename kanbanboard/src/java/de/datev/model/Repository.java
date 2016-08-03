/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.datev.model;

import java.util.ArrayList;

/**
 *
 * @author TG00029
 */
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
