package de.datev.model;

public class TaskList {
    
    private int listId;

    private String listName;

    public int getListId() {
        return listId;
    }

    public void setListId(int listId) {
        this.listId = listId;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }
    
    public TaskList(){}
    
    public TaskList(int listId, String listName) {
        this.listId = listId;
        this.listName = listName;
    }
}
