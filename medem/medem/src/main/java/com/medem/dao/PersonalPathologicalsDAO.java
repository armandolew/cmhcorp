package com.medem.dao;

import java.util.List;

import com.medem.model.PersonalPathologicals;

public interface PersonalPathologicalsDAO {
	public void addPersonalPathologicals(PersonalPathologicals personalPathologicals);
	public List<PersonalPathologicals> listPersonalPathologicals(int medicalRecordId);
	public PersonalPathologicals getPersonalPathologicalsById(int id);
}
