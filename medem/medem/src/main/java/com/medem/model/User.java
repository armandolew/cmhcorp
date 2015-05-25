package com.medem.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

/**
 * <b>User</b> 
 * @author d5lment
 *
 */
@Entity
@Table(name = "users")
public class User implements Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;
        
    @Column(name = "password")
    @NotNull
    @Size(min = 3, max = 50)
    private String password;

    /** <code>TRUE</code> if and only if enabled for the {@link Company} which is related **/
    @Column(name = "enabled")
    @NotNull
    private Boolean enabled;

    @Column(name = "name")
    @NotNull
    @Size(min = 1, max = 150)
    private String name;

    @Column(name = "firstname")
    @NotNull
    @Size(min = 1, max = 150)
    private String firstname;

    @Column(name = "lastname")
    @NotNull
    @Size(min = 1, max = 150)
    private String lastname;

    /** The **/
    @Email
    @Column(name = "email")
    @NotNull
    @Size(min = 1, max = 200)
    private String email;
    
    /** Primary key **/
    @Id
    @Column(name = "username")
    @NotNull
    @Size(min = 1, max = 150)
    private String username;

    /** Date of registration of the {@link User}  **/
    @Column(name = "createdAt")
    @NotNull
    private Date createdAt;

    /** Name of the administrator who created the user **/
    @Column(name = "createdBy")
    @NotNull
    @Size(min = 1, max = 400)
    private String createdBy;

    /** {@link Company} to which the user is related **/    
    @JoinColumn(name = "id_company", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @NotNull
    private Company company;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String creayedBy) {
        this.createdBy = creayedBy;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

}