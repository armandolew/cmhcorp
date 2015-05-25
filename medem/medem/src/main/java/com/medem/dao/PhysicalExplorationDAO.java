package com.medem.dao;

import java.util.List;

import com.medem.model.PhysicalExploration;

public interface PhysicalExplorationDAO {
	
	public void addPhysicalExploration(PhysicalExploration physicalExploration);
	public List<PhysicalExploration> listPhysicalExploration(int employeeId);
	public PhysicalExploration getPhysicalExplorationById(int id);
}
