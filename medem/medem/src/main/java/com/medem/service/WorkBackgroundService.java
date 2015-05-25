package com.medem.service;

import java.util.List;

import com.medem.dto.WorkBackgroundDTO;
import com.medem.model.WorkBackground;


public interface WorkBackgroundService {

	public void addWorkBackground(WorkBackground workBackground);
	public List<WorkBackgroundDTO> listWorkBackgrounds(int employee_id);
	public WorkBackgroundDTO getWorkBackgroundById(int id);	
	
}
