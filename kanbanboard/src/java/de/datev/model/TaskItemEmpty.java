/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.datev.model;

import java.util.Date;

/**
 *
 * @author TG00026
 */
public class TaskItemEmpty {
    private String description;
    private String assignedTo;
        
    public void setDescription(String description) {
        this.description = description;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getDescription() {
        return description;
    }
    
    public String getAssignedTo() {
        return assignedTo;
    }
    
    public TaskItemEmpty() {
        this.assignedTo = "Not Assigned";
        this.description = "No Description";
    }
    
    public TaskItemEmpty(String description) {
        this.description = description;
        this.assignedTo = "Not Assigned";
    }
    
    public TaskItemEmpty(String description, String assignedTo) {
        this.description = description;
        this.assignedTo = assignedTo;
    }
}