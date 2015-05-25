package com.medem.dao;

import java.util.List;

import com.medem.model.BodySystem;

public interface BodySystemDAO {
    
    public BodySystem getBodySystemById(int id);
    public List<BodySystem> listBodySystems();

}
