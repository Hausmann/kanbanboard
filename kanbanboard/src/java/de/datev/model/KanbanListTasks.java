/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.datev.model;

import java.util.ArrayList;

/**
 *
 * @author TG00026
 */
public class KanbanListTasks {
    private ArrayList<TaskItemModel> tasks;

    public ArrayList<TaskItemModel> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<TaskItemModel> tasks) {
        this.tasks = tasks;
    }
    
    public KanbanListTasks(){
        
    }
}
