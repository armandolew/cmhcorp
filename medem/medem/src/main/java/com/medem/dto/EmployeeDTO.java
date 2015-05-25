package com.medem.dto;

import java.io.Serializable;
import java.util.Date;

import com.medem.model.Address;
import com.medem.model.Area;
import com.medem.model.BloodGroup;
import com.medem.model.Company;

public class EmployeeDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private int id; 
    private String name;
    private String lastName1;
    private String lastName2;
    private Integer gender;
    private Integer maritalStatus;
    private String religion; 
    private Integer rh;
    private String originPlace;
    private String phone;
    private String contactName;
    private String contactPhone;
    private Date createdAt;
    private String createdBy;
    private Date dateOfBirth;
    private String profileImage;
    private Address address;
    private BloodGroup bloodGroup;
    private Company company;
    private Area area;
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
    
    
}