package de.datev.model;

public class Task {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getListId() {
        return listId;
    }

    public void setListId(int listId) {
        this.listId = listId;
    }
    private String name;
    private String description;
    private int listId;

    public Task(int id, String name, String description, int list) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.listId = list;
    }

    public Task() {
        this.id = 1;
        this.name = "test";
        this.description = "rtee";
        this.listId = 5;
    }

    

    //TODO Task-Liste einfügen
}
