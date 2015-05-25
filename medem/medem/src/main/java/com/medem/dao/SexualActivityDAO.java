package com.medem.dao;

import java.util.List;

import com.medem.model.SexualActivity;

public interface SexualActivityDAO {

	public void addSexualActivity(SexualActivity sexualActivity);
	public List<SexualActivity> listSexualActivity();
	
}
