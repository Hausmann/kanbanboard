package de.datev.model;

import java.awt.Button;
import java.util.ArrayList;

public class KanbanListModel {
    private static int currentNumber = 0;
    private int id;
    private String name;
    private String beschreibung;
    private Button addTaskButton;

    public void setTasks(ArrayList<TaskItemModel> tasks) {
        this.tasks = tasks;
    }

    public ArrayList<TaskItemModel> getTasks() {
        return tasks;
    }
    private ArrayList<TaskItemModel> tasks;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
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

    //TODO Task-Liste einfügen
    
    public KanbanListModel(String name, String beschreibung)
    {
        this.id = this.currentNumber;
        this.currentNumber++;
        this.name = name;
        this.beschreibung = beschreibung;
        this.tasks = new ArrayList<TaskItemModel>();
        this.tasks.add(new TaskItemModel("TEST", "Michael"));
        this.tasks.add(new TaskItemModel("TEST2", "Timon"));
        this.tasks.add(new TaskItemModel("TEST3", "Julian"));
    }
    
    public KanbanListModel()
    {
        this.id = this.currentNumber;
        this.currentNumber++;
        this.name = "Default-Name";
        this.beschreibung = "Default-Beschreibung";
        this.tasks = new ArrayList<TaskItemModel>();
        this.tasks.add(new TaskItemModel("TEST", "Michael"));
        this.tasks.add(new TaskItemModel("TEST2", "Timon"));
        this.tasks.add(new TaskItemModel("TEST3", "Julian"));
    }
    
    public KanbanListModel(String name)
    {
        this.id = this.currentNumber;
        this.currentNumber++;
        this.name = name;
        this.beschreibung = "Default-Beschreibung";
        this.tasks = new ArrayList<TaskItemModel>();
        this.tasks.add(new TaskItemModel("TEST", "Michael"));
        this.tasks.add(new TaskItemModel("TEST2", "Timon"));
        this.tasks.add(new TaskItemModel("TEST3", "Julian"));
    }
    
    public TaskItemModel GetTaskByID(int id)
    {
        return tasks.get(id);
    }
}
