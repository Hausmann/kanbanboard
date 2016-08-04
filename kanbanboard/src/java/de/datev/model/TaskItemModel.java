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
public class TaskItemModel {
    private static int currentNumber = 0;
    private int id;
    private String description;
    private String assignedTo;
    private Date date;

    public void setId(int id) {
        this.id = id;
    }
        
    public void setDescription(String description) {
        this.description = description;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
    
    public String getAssignedTo() {
        return assignedTo;
    }

    public Date getDate() {
        return date;
    }
    
    public TaskItemModel() {
        this.assignedTo = "Not Assigned";
        this.description = "No Description";
        this.date = new Date();
        this.id = currentNumber;
        this.currentNumber++;
    }
    
    public TaskItemModel(String description) {
        this.description = description;
        this.assignedTo = "Not Assigned";
        this.date = new Date();
        this.id = currentNumber;
        this.currentNumber++;
    }
    
    public TaskItemModel(String description, String assignedTo) {
        this.description = description;
        this.assignedTo = assignedTo;
        this.date = new Date();
        this.id = currentNumber;
        this.currentNumber++;
    }
    
}
