package com.medem.dao;

import java.util.List;
import com.medem.model.WorkBackground;

public interface WorkBackgroundDAO {

	public void addWorkBackground(WorkBackground workBackground);
	public List<WorkBackground> listWorkBackgrounds(int employee_id);
	public WorkBackground getWorkBackgroundById(int id);
	
}
