package com.medem.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="section_diagnoses")
public class SectionDiagnoses implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
        
    @Column(name="id_medicalHistory", updatable=false, insertable=false)
    private int idMedicalHistory;
    
    @ManyToOne
    @JoinColumn(name="id_diagnosis", nullable=false)
    private Diagnosis diagnosis;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdMedicalHistory() {
        return idMedicalHistory;
    }

    public void setIdMedicalHistory(int idMedicalHistory) {
        this.idMedicalHistory = idMedicalHistory;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

}