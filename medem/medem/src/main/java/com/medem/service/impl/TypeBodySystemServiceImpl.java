package com.medem.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medem.dao.TypeBodySystemDAO;
import com.medem.dto.Assembler;
import com.medem.dto.TypeBodySystemDTO;
import com.medem.model.TypeBodySystem;
import com.medem.service.TypeBodySystemService;

@Service("typeBodySystemService")
public class TypeBodySystemServiceImpl implements TypeBodySystemService {

    @Autowired
    private TypeBodySystemDAO typeBodySystemDAO;
    
    @Override
    @Transactional
    public List<TypeBodySystemDTO> listTypeBodySystem() throws Exception {
        List<TypeBodySystemDTO> listTypeBody = new ArrayList<TypeBodySystemDTO>();
        
        try{
            for(TypeBodySystem typeBodySystem : this.typeBodySystemDAO.listTypeBodysystem()){
                listTypeBody.add(Assembler.createTypeBodySystemDTO(typeBodySystem));
            }
        }
        catch(DataAccessException dae){
            throw new Exception();
        }
        
        return listTypeBody;
    }

}
