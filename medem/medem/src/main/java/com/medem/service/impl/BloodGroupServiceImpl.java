package com.medem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medem.dao.BloodGroupDAO;
import com.medem.dto.Assembler;
import com.medem.dto.BloodGroupDTO;
import com.medem.service.BloodGroupService;

@Service("bloodGroupService")
public class BloodGroupServiceImpl implements BloodGroupService {
    
    @Autowired
    private BloodGroupDAO bloodGroupDAO;

    @Override
    @Transactional
    public BloodGroupDTO getBloodGroupById(int id) throws Exception{
        BloodGroupDTO bloodGroupDTO = null;
        try{
            bloodGroupDTO = Assembler.createBloodGroupDTO(this.bloodGroupDAO.getBloodGroupById(id));
        }
        catch(DataAccessException dae){
            throw new Exception();
        }
        
        return bloodGroupDTO;
    }

}
