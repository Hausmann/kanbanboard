/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.datev.model;

import java.util.ArrayList;

/**
 *
 * @author TG00026
 */
public class KanbanListList {
    private ArrayList<KanbanListModel> lists;

    public ArrayList<KanbanListModel> getLists() {
        return lists;
    }

    public void setLists(ArrayList<KanbanListModel> lists) {
        this.lists = lists;
    }
    
    public KanbanListList(){
        
    }
}
