package com.medem.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medem.dao.BodySystemDAO;
import com.medem.dto.Assembler;
import com.medem.dto.BodySystemDTO;
import com.medem.model.BodySystem;
import com.medem.service.BodySystemService;

@Service("bodySystemService")
public class BodySystemServiceImpl implements BodySystemService {
    
    @Autowired
    private BodySystemDAO bodySystemDAO;

    @Override
    @Transactional
    public BodySystemDTO getBodySystemById(int id) {
        return Assembler.createBodySystemDTO(this.bodySystemDAO.getBodySystemById(id));
    }

    @Override
    @Transactional
    public List<BodySystemDTO> listBodySystems() throws Exception {
        List<BodySystemDTO> listBodySystems = new ArrayList<BodySystemDTO>();
        
        try{
            for(BodySystem bodySystem : this.bodySystemDAO.listBodySystems()){
                listBodySystems.add(Assembler.createBodySystemDTO(bodySystem));
            }
        }
        catch(DataAccessException dae){
            throw new Exception();
        }
        
        return listBodySystems;
    }
    

}
