package de.datev.model;

public class KanbanListModel {
    private int id;

    public KanbanListModel(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }
    private String name;
    private String beschreibung;

    //TODO Task-Liste einfügen
    
    public KanbanListModel(){}
    
    
    public KanbanListModel(int id, String name, String beschreibung)
    {
        this.id = id;
        this.name = name;
        this.beschreibung = beschreibung;
    }
}
