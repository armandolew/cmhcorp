package com.medem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medem.dao.RiskDAO;
import com.medem.dto.Assembler;
import com.medem.dto.RiskDTO;
import com.medem.service.RiskService;

@Service("riskService")
public class RiskServiceImpl implements RiskService {

    @Autowired
    private RiskDAO riskDAO;
    
    @Override
    @Transactional
    public RiskDTO getRiskById(int id) throws Exception {
        try{
            return Assembler.createRiskDTO(this.riskDAO.getRiskById(id));
        }
        catch(Exception e){
            throw new Exception();
        }
    }

}
