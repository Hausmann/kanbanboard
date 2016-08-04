package de.datev.model;

import java.awt.Button;
import java.util.ArrayList;

public class KanbanListModel {
    private static int currentNumber = 0;
    private int id;
    private String name;
    private Button addTaskButton;
    private ArrayList<TaskItemModel> tasks;

    public void setTasks(ArrayList<TaskItemModel> tasks) {
        this.tasks = tasks;
    }

    public ArrayList<TaskItemModel> getTasks() {
        return tasks;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //TODO Task-Liste einfügen
    
    public KanbanListModel()
    {
        this.id = this.currentNumber;
        this.currentNumber++;
        this.name = "Default-Name";
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
        this.tasks = new ArrayList<TaskItemModel>();
    }
    
    public TaskItemModel GetTaskByID(int id)
    {
        return tasks.get(id);
    }
    
    public void AddNewTask(String assignedTo, String description) {
        this.tasks.add(new TaskItemModel(assignedTo, description));
    }
}
