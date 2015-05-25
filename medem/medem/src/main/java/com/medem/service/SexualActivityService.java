package com.medem.service;

import java.util.List;

import com.medem.dto.SexualActivityDTO;
import com.medem.model.SexualActivity;

public interface SexualActivityService {

	public void addSexualActivity(SexualActivity sexualActivity);
	public List<SexualActivityDTO> listSexualActivity();
}
