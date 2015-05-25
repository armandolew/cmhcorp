package com.medem.service;

import java.util.List;

import com.medem.dto.PhysicalExplorationDTO;
import com.medem.model.PhysicalExploration;

public interface PhysicalExplorationService {
	
	public void addPhysicalExploration(PhysicalExploration physicalExploration);
	public List<PhysicalExplorationDTO> listPhysicalExploration(int employeeId);
	public PhysicalExplorationDTO getPhysicalExplorationById(int id);

}
