/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.kboard.api.beans;

/**
 *
 * @author TG00028
 */

public class Task {
    
    private int id;
    
    private String name;
    
    private String conntent;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getConntent() {
        return conntent;
    }

    public Task(int id, String name, String conntent) {
        this.id = id;
        this.name = name;
        this.conntent = conntent;
    }

    public Task(int id) {
        this.id = id;
    }
    
}
