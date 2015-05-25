package com.medem.dto;

import java.io.Serializable;

public class BloodGroupDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private int id;
    private String group;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }
}
