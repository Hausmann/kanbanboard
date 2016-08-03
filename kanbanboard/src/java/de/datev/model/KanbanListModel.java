package de.datev.model;

public class KanbanListModel {
    public int id;
    public String name;
    public String beschreibung;

    //TODO Task-Liste einfügen
    
    public KanbanListModel(int id, String name, String beschreibung)
    {
        this.id = id;
        this.name = name;
        this.beschreibung = beschreibung;
    }
}
