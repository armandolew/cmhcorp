package com.medem.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="employee")
public class Employee implements Serializable{
	
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;	
	
    @NotEmpty
    @Column(name="name")
	private String name;
    
    @NotEmpty
    @Column(name="lastName1")
	private String lastName1;
    
    @NotEmpty
    @Column(name="lastName2")
	private String lastName2;
    
    @NotNull
    @Column(name="gender")
    private Integer gender;
    
    @Column(name="maritalStatus")
    private Integer maritalStatus;
    
    @Column(name="religion")
    private String religion;    
    
    @NotNull
	@Column(name="rh")
	private Integer rh;
	
	@Column(name="originPlace")
	private String originPlace;	
	
	@NotEmpty
	@Column(name="phone")
	private String phone;
	
	@NotEmpty
	@Column(name="contactName")
	private String contactName;
	
	@NotEmpty
	@Column(name="contactPhone")
	private String contactPhone;	
		

	@NotNull
    @Column(name="createdAt")
    private Date createdAt;
	
	@NotEmpty
    @Column(name="createdBy")
	private String createdBy;
		
	
	@NotNull
	@Column(name="dateOfBirth")
	private Date dateOfBirth;
	
	@Column(name="profileImage")
	private String profileImage;
	
	@NotNull
	@JoinColumn(name ="id_address", referencedColumnName = "id", nullable = false)
	@OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER)    
    private Address address;
	
	@NotNull
    @JoinColumn(name ="id_bloodGroup", referencedColumnName = "id", nullable = false)
	//@OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER)
	@OneToOne(fetch = FetchType.EAGER)
    private BloodGroup bloodGroup;
		
	@NotNull
    @JoinColumn(name ="id_company", referencedColumnName = "id", nullable = false)
    //@OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER)
	@OneToOne(fetch = FetchType.EAGER)
    private Company company;
	
	@NotNull
    @JoinColumn(name ="id_area", referencedColumnName = "id", nullable = false)
    //@OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER)
	@OneToOne(fetch = FetchType.EAGER)
    private Area area;
	
	@Column(name="enabled")
	private Boolean enabled;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Integer maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public Integer getRh() {
        return rh;
    }

    public void setRh(Integer rh) {
        this.rh = rh;
    }

    public String getOriginPlace() {
        return originPlace;
    }

    public void setOriginPlace(String originPlace) {
        this.originPlace = originPlace;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
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

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    @Override
    public String toString(){
        return "Employee: {"
               + "id: " + id
               + ", name: " + name
               + ", lastname: " + lastName1
               + ", lastname: " + lastName2
               + ", dateOfBirth: " + dateOfBirth
               + ", gender: " + gender
               + ", maritalStatus: " + maritalStatus
               + ", religion: " + religion
               + ", bloodGroup: " + bloodGroup
               + ", RH: " + rh
               + ", originPlace: " + originPlace
               + ", address: " + address.getStreet()
               + ", phone: " + phone
               + ", town: " + address.getTown()
               + ", zipCode: " + address.getZipcode()
               + ", contactName: " + contactName
               + ", contactPhone: " + contactPhone
               + ", area: " + area
               + ", company: " + company
               + ", createdAt: " + createdAt
               + ", createdBy: " + createdBy
               + "}"; 
    }
}