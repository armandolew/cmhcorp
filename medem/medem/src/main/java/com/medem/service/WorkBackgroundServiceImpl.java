package com.medem.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medem.MainController;
import com.medem.dao.WorkBackgroundDAO;
import com.medem.dto.Assembler;
import com.medem.dto.WorkBackgroundDTO;
import com.medem.model.WorkBackground;

@Service("workBackground")
public class WorkBackgroundServiceImpl implements WorkBackgroundService {
	
	@Autowired
	private WorkBackgroundDAO workBackgroundDAO;
	
	private static final Logger logger = Logger.getLogger(MainController.class);
	
	@Override
	@Transactional
	public void addWorkBackground(WorkBackground workBackground){
		this.workBackgroundDAO.addWorkBackground(workBackground);
	}
	
	@Override
	@Transactional
	public List<WorkBackgroundDTO> listWorkBackgrounds(int employee_id){
		List<WorkBackgroundDTO> listWorkBackgroundDTO = new ArrayList<WorkBackgroundDTO>();
		BasicConfigurator.configure();
		
		try{
			for (WorkBackground workBackground : workBackgroundDAO.listWorkBackgrounds(employee_id)){
				listWorkBackgroundDTO.add(Assembler.createWorkBackgroundDTO(workBackground));
			}
		}
		catch (Exception e){
			logger.debug(e);
		}
		return listWorkBackgroundDTO;
	}
	
	@Override
	@Transactional
	public WorkBackgroundDTO getWorkBackgroundById(int id){
		return Assembler.createWorkBackgroundDTO(workBackgroundDAO.getWorkBackgroundById(id));
	}	

}
