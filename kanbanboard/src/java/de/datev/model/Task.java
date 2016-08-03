package de.datev.model;

public class Task {
    
    private int id;
    private String name;
    private String description;
    private String list;

    public Task(int id, String name, String description, String list) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.list = list;
    }

    public Task(){}
    
    public String getDescription() {
        return description;
    }

    public String getList() {
        return list;
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
