package com.medem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medem.dao.SexualActivityDAO;
import com.medem.dto.Assembler;
import com.medem.dto.SexualActivityDTO;
import com.medem.model.SexualActivity;

@Service("sexualActivityService")
public class SexualActivityServiceImpl implements SexualActivityService {
	
	@Autowired
	private SexualActivityDAO sexualActivityDAO;

	@Override
	@Transactional
	public void addSexualActivity(SexualActivity sexualActivity) {
		// TODO Auto-generated method stub
		this.sexualActivityDAO.addSexualActivity(sexualActivity);
	}

	@Override
	public List<SexualActivityDTO> listSexualActivity() {
		// TODO Auto-generated method stub
		List <SexualActivityDTO> listSexualActivity = new ArrayList<SexualActivityDTO>();
		
		try{
			for (SexualActivity item : sexualActivityDAO.listSexualActivity()){
				listSexualActivity.add(Assembler.createSexualActivityDTO(item));
			}
		}
		
		catch (Exception e){
			
		}
		
		return listSexualActivity;
	}

}
