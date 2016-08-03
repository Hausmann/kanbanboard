/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.datev.model;

/**
 *
 * @author TG00029
 */
public class TaskList {
    
    private int listId;

    private String listName;
    
    public int getListId() {
        return listId;
    }

    public String getListName() {
        return listName;
    }   
    
    public TaskList(){}
    
    public TaskList(int listId, String listName) {
        this.listId = listId;
        this.listName = listName;
    }
    
    
}
