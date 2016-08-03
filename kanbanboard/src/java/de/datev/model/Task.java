package de.datev.model;

public class Task {
    private int id;

    public Task(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBeschreibung() {
        return description;
    }
    private String name;
    private String description;

    //TODO Task-Liste einfügen
    
    public Task(){}
    
    
    public Task(int id, String name, String beschreibung)
    {
        this.id = id;
        this.name = name;
        this.description = beschreibung;
    }
}
