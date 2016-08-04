/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.datev.model;

import java.awt.Button;
import java.util.ArrayList;

/**
 *
 * @author TG00026
 */
public class KanbanBoardModel {
    private ArrayList<KanbanListModel> lists;
    private String title;
    private Button addListButton;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAddListButton(Button addListButton) {
        this.addListButton = addListButton;
    }

    public String getTitle() {
        return title;
    }

    public Button getAddListButton() {
        return addListButton;
    }

    public void setLists(ArrayList<KanbanListModel> lists) {
        this.lists = lists;
    }

    public ArrayList<KanbanListModel> getLists() {
        return lists;
    }
    
    public KanbanBoardModel() {
        this.lists = new ArrayList<KanbanListModel>();
        this.title = "Kanban Board";
        this.lists.add(new KanbanListModel("Backlog"));
        this.lists.add(new KanbanListModel("In Work"));
        this.lists.add(new KanbanListModel("Done"));
    }
    
    public KanbanBoardModel(String title) {
        this.lists = new ArrayList<KanbanListModel>();
        this.title = title;
        this.lists.add(new KanbanListModel("Backlog"));
        this.lists.add(new KanbanListModel("In Work"));
        this.lists.add(new KanbanListModel("Done"));
    }
    
    public KanbanListModel GetListByID(int id)
    {
        return lists.get(id);
    }
    
    public void AddNewList(String name)
    {
        KanbanListModel newList = new KanbanListModel(name);
        this.lists.add(newList);
    }
    
    public KanbanListList GetArrayListOfTaskLists()
    {
        KanbanListList ListOfTaskLists = new KanbanListList();
        ListOfTaskLists.setLists(this.lists);
        return ListOfTaskLists;
    }
}
