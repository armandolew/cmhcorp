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
 * <b>PersonalNonpathological</b>. Catalog of personal pathological
 * 
 *
 */
@Entity
@Table(name="cat_personal_nonpathological")
public class CatPersonalNonpathological implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 4626231842331917594L;
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @NotEmpty
    @Column(name="personal_nonpathological")
    private String personalNonpathological;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPersonalNonpathological() {
        return personalNonpathological;
    }

    public void setPersonalNonpathological(String personalNonpathological) {
        this.personalNonpathological = personalNonpathological;
    }

}