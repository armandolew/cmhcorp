package com.medem.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * <b>ActivityCompany</b> detailed activities that are registered for an {@link Company}
 * @author d5lment
 *
 */
@Entity
@Table(name = "cat_activity_company")
public class ActivityCompany implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @NotNull
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Column(name="activity")
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