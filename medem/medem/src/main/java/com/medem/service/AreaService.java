package com.medem.service;

import java.util.List;

import com.medem.dto.AreaDTO;
import com.medem.model.Area;

public interface AreaService {

	public void addArea(Area area) throws Exception;
	public List<AreaDTO> listAreas(int id_company) throws Exception;
	public AreaDTO getAreaById(int id) throws Exception;
	public Long countAreas(int id_company) throws Exception;
	public void updateArea(Area area) throws Exception;
	public AreaDTO getFullArea(int id) throws Exception;
	public List<AreaDTO> searchArea(String name, int id_company) throws Exception;
	public void deleteArea(Area area) throws Exception;
}
