package com.medem.service;

import java.util.List;

import com.medem.dto.BodySystemDTO;

public interface BodySystemService {
    
    public BodySystemDTO getBodySystemById(int id);
    public List<BodySystemDTO> listBodySystems() throws Exception;

}
