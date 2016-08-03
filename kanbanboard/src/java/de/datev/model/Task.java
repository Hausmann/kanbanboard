package de.datev.model;

public class Task {
    
    private int id;
    private String name;
    private String description;
    private int listId;

    public Task(int id, String name, String description, int list) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.listId = list;
    }

    public Task(){}
    
    public String getDescription() {
        return description;
    }

    public int getListId() {
        return listId;
    }
    
    public Task(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    //TODO Task-Liste einfügen
    
    
}
