package com.medem.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * <b>PersonalPathological</b>. Catalog of personal pathological
 * 
 *
 */
@Entity
@Table(name="cat_personal_pathological")
public class CatPersonalPathological implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -1354175592193430037L;
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @NotEmpty
    @Column(name="personal_pathologicalcal")
    private String personalPathological;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPersonalPathological() {
        return personalPathological;
    }

    public void setPersonalPathological(String personalPathological) {
        this.personalPathological = personalPathological;
    }

}