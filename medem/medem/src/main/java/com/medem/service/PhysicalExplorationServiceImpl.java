package com.medem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medem.dao.PhysicalExplorationDAO;
import com.medem.dto.Assembler;
import com.medem.dto.PhysicalExplorationDTO;
import com.medem.model.PhysicalExploration;

@Service("physicalExplorationService")
public class PhysicalExplorationServiceImpl implements PhysicalExplorationService {

	@Autowired
	private PhysicalExplorationDAO physicalExplorationDAO;
	
	@Override
	@Transactional
	public void addPhysicalExploration(PhysicalExploration physicalExploration) {
		this.physicalExplorationDAO.addPhysicalExploration(physicalExploration);
		
	}

	@Override
	@Transactional
	public List<PhysicalExplorationDTO> listPhysicalExploration(int employeeId) {
		List <PhysicalExplorationDTO> listPhysicalExplorationDTO = new ArrayList<PhysicalExplorationDTO>();
		
		try{
			for (PhysicalExploration physicalExploration : physicalExplorationDAO.listPhysicalExploration(employeeId)){
				listPhysicalExplorationDTO.add(Assembler.createPhysicalExplorationDTO(physicalExploration));
			}
		}
		catch(Exception e){
			
		}
		
		return listPhysicalExplorationDTO;
	}

	@Override
	@Transactional
	public PhysicalExplorationDTO getPhysicalExplorationById(int id) {
		return Assembler.createPhysicalExplorationDTO(physicalExplorationDAO.getPhysicalExplorationById(id));
	}

}
