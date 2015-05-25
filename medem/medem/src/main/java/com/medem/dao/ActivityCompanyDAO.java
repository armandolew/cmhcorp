package com.medem.dao;

import java.util.List;

import com.medem.model.ActivityCompany;

public interface ActivityCompanyDAO {
    
    public ActivityCompany getActivityCompanyById(int id);
    public List<ActivityCompany> listActivities(String tag);
    
}
