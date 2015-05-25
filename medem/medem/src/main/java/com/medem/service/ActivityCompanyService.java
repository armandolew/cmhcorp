package com.medem.service;

import java.util.List;

import com.medem.dto.ActivityCompanyDTO;

public interface ActivityCompanyService {

    public ActivityCompanyDTO getActivityCompanyById(int id);
    public List<ActivityCompanyDTO> listActivitiesFromTag(String tag);
}
