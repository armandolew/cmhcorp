package com.medem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medem.dao.AreaDAO;
import com.medem.dto.AreaDTO;
import com.medem.dto.Assembler;
import com.medem.model.Area;

@Service("areaService")
public class AreaServiceImpl implements AreaService {
	
	@Autowired
	private AreaDAO areaDAO;

	@Override
	@Transactional
	public void addArea(Area area) throws Exception {
	    try{
		  this.areaDAO.addArea(area);
	    }
	    catch(DataAccessException dae){
	        throw new Exception();
	    }
		
	}

	@Override
	@Transactional
	public List<AreaDTO> listAreas(int id_company) throws Exception {
		List<AreaDTO> listAreasDTO = new ArrayList<AreaDTO>();
		try{
			for(Area area : areaDAO.listAreas(id_company)){
				listAreasDTO.add(Assembler.createAreaDTO(area));
			}
		}
		catch(DataAccessException dae){
		  throw new Exception();
		}
		return listAreasDTO;
	}

	@Override
	@Transactional
	public AreaDTO getAreaById(int id) throws Exception {
	    try{
		  return Assembler.createAreaDTO(areaDAO.getAreaById(id));
	    }
	    catch(DataAccessException dae){
	        throw new Exception();
	    }
	}

	@Override
	@Transactional
	public Long countAreas(int id_company) throws Exception {
	    try{
		  return this.areaDAO.countAreas(id_company);
	    }
	    catch(DataAccessException dae){
	        throw new Exception();
	    }
	}

    @Override
    @Transactional
    public void updateArea(Area area) throws Exception {
        try{
          this.areaDAO.updateArea(area);
        }
        catch(DataAccessException dae){
            throw new Exception();
        }
        
    }

	@Override
	@Transactional
	public AreaDTO getFullArea(int id) throws Exception{
	    AreaDTO areaDTO = null;
	    try{
	        areaDTO = Assembler.createAreaDTO(this.areaDAO.getFullArea(id));
	    }
	    catch(DataAccessException dae){
	        throw new Exception();
	    }
	    
	    return areaDTO;
	}
	

	@Override
	@Transactional
	public List<AreaDTO> searchArea(String name, int id_company) throws Exception{
	    List<AreaDTO> listAreasSearch = new ArrayList<AreaDTO>();
	    
	    try{
	        for(Area area : this.areaDAO.searchArea(name, id_company)){
	            listAreasSearch.add(Assembler.createAreaDTO(area));
	        }
	    }
	    catch(DataAccessException dae){
	        throw new Exception();
	    }
	    
	    return listAreasSearch;
	}
	
	@Override
	@Transactional
	public void deleteArea(Area area) throws Exception{
	    try{
	        this.areaDAO.deleteArea(area);
	    }
	    catch(DataAccessException dae){
	        throw new Exception();
	    }
	}
}
