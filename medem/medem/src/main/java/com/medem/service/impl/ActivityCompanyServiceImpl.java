package com.medem.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medem.dao.ActivityCompanyDAO;
import com.medem.dto.ActivityCompanyDTO;
import com.medem.dto.Assembler;
import com.medem.model.ActivityCompany;
import com.medem.service.ActivityCompanyService;
import com.medem.service.AreaServiceImpl;

@Service("ActivityCompanyService")
public class ActivityCompanyServiceImpl implements ActivityCompanyService {
    
    @Autowired
    private ActivityCompanyDAO activityCompanyDAO;
    
    private static final Logger logger = Logger.getLogger(AreaServiceImpl.class);
    
    @Override
    @Transactional
    public ActivityCompanyDTO getActivityCompanyById(int id){
        BasicConfigurator.configure();
        ActivityCompanyDTO activityCompanyDTO = null;
        try{
            activityCompanyDTO = Assembler.createActivityCompanyDTO(this.activityCompanyDAO.getActivityCompanyById(id));
        }
        catch(DataAccessException dae){
            logger.error(dae);
        }
        return activityCompanyDTO;
    }

    @Override
    @Transactional
    public List<ActivityCompanyDTO> listActivitiesFromTag(String tag) {
        List<ActivityCompanyDTO> listActivities = new ArrayList<ActivityCompanyDTO>();
        
        try{
            for(ActivityCompany activityCompany : activityCompanyDAO.listActivities(tag)){
                listActivities.add(Assembler.createActivityCompanyDTO(activityCompany));
            }
            
        }
        catch(Exception e){
            
        }
        
        return listActivities;
    }

}
