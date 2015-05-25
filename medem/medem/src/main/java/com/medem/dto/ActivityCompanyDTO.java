package com.medem.dto;

import java.io.Serializable;


public class ActivityCompanyDTO implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private int id;
    private String activity;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getActivity() {
        return activity;
    }
    public void setActivity(String activity) {
        this.activity = activity;
    }

}
