package com.medem.dto;

import java.util.Date;

import com.medem.model.ActivityCompany;
import com.medem.model.Address;
import com.medem.model.Area;
import com.medem.model.BloodGroup;
import com.medem.model.BodySystem;
import com.medem.model.Company;
import com.medem.model.Diagnosis;
import com.medem.model.Employee;
import com.medem.model.EmployeeRisk;
import com.medem.model.FamilyDisease;
import com.medem.model.FamilyHistory;
import com.medem.model.MedicalExam;
import com.medem.model.MedicalHistory;
import com.medem.model.MedicalNote;
import com.medem.model.PersonalPathologicals;
import com.medem.model.PhysicalExploration;
import com.medem.model.Risk;
import com.medem.model.SexualActivity;
import com.medem.model.TypeBodySystem;
import com.medem.model.TypeDiagnosis;
import com.medem.model.User;
import com.medem.model.WorkBackground;

public class Assembler {
	
    public static EmployeeDTO createEmployeeDTO(Employee employee){
        EmployeeDTO employeeDTO = new EmployeeDTO();
        
        int id = (employee.getId() > 0) ? employee.getId() : 0; 
        String name = (employee.getName() != null) ? employee.getName() : "";
        String lastName1 = (employee.getLastName1() != null) ? employee.getLastName1() : "";
        String lastName2 = (employee.getLastName2() != null) ? employee.getLastName2() : "";
        Integer gender = (employee.getGender() > 0) ? employee.getGender() : 0;
        Integer maritalStatus = (employee.getMaritalStatus() > 0) ? employee.getMaritalStatus() : 0;
        String religion = (employee.getReligion() != null) ? employee.getReligion() : ""; 
        Integer rh = (employee.getRh() > 0) ? employee.getRh() : 0;
        String originPlace = (employee.getOriginPlace() != null) ? employee.getOriginPlace() : "";
        String phone = (employee.getPhone() != null) ? employee.getPhone() : "";
        String contactName = (employee.getContactName() != null) ? employee.getContactName() : "";
        String contactPhone = (employee.getContactPhone() != null) ? employee.getContactPhone() : "";
        Date createdAt = (employee.getCreatedAt() != null) ? employee.getCreatedAt() : null; 
        String createdBy = (employee.getCreatedBy() != null) ? employee.getCreatedBy() : "";
        Date dateOfBirth = (employee.getDateOfBirth() != null) ? employee.getDateOfBirth() : null;
        String profileImage = (employee.getProfileImage() != null) ? employee.getProfileImage() : "";
        Address address = (employee.getAddress() != null) ? employee.getAddress() : null;
        BloodGroup bloodGroup = (employee.getBloodGroup() != null) ? employee.getBloodGroup() : null;
        Company company = (employee.getCompany() != null) ? employee.getCompany() : null;
        Area area = (employee.getArea() != null) ? employee.getArea() : null;
        Boolean enabled = (employee.getEnabled() != null) ? employee.getEnabled() : false;
        
        employeeDTO.setId(id);
        employeeDTO.setName(name);
        employeeDTO.setLastName1(lastName1);
        employeeDTO.setLastName2(lastName2);
        employeeDTO.setGender(gender);
        employeeDTO.setMaritalStatus(maritalStatus);
        employeeDTO.setReligion(religion);
        employeeDTO.setRh(rh);
        employeeDTO.setOriginPlace(originPlace);
        employeeDTO.setPhone(phone);
        employeeDTO.setContactName(contactName);
        employeeDTO.setContactPhone(contactPhone);
        employeeDTO.setCreatedAt(createdAt);
        employeeDTO.setCreatedBy(createdBy);
        employeeDTO.setDateOfBirth(dateOfBirth);
        employeeDTO.setProfileImage(profileImage);
        employeeDTO.setAddress(address);
        employeeDTO.setBloodGroup(bloodGroup);
        employeeDTO.setCompany(company);
        employeeDTO.setArea(area);
        employeeDTO.setEnabled(enabled);
        
        return employeeDTO;
    }
	
    public static Employee createEmployee(EmployeeDTO employeeDTO){
        Employee employee = new Employee();
        
        int id = (employeeDTO.getId() > 0) ? employeeDTO.getId() : 0; 
        String name = (employeeDTO.getName() != null) ? employeeDTO.getName() : "";
        String lastName1 = (employeeDTO.getLastName1() != null) ? employeeDTO.getLastName1() : "";
        String lastName2 = (employeeDTO.getLastName2() != null) ? employeeDTO.getLastName2() : "";
        Integer gender = (employeeDTO.getGender() > 0) ? employeeDTO.getGender() : 0;
        Integer maritalStatus = (employeeDTO.getMaritalStatus() > 0) ? employeeDTO.getMaritalStatus() : 0;
        String religion = (employeeDTO.getReligion() != null) ? employeeDTO.getReligion() : ""; 
        Integer rh = (employeeDTO.getRh() > 0) ? employeeDTO.getRh() : 0;
        String originPlace = (employeeDTO.getOriginPlace() != null) ? employeeDTO.getOriginPlace() : "";
        String phone = (employeeDTO.getPhone() != null) ? employeeDTO.getPhone() : "";
        String contactName = (employeeDTO.getContactName() != null) ? employeeDTO.getContactName() : "";
        String contactPhone = (employeeDTO.getContactPhone() != null) ? employeeDTO.getContactPhone() : "";
        Date createdAt = (employeeDTO.getCreatedAt() != null) ? employeeDTO.getCreatedAt() : null; 
        String createdBy = (employeeDTO.getCreatedBy() != null) ? employeeDTO.getCreatedBy() : "";
        Date dateOfBirth = (employeeDTO.getDateOfBirth() != null) ? employeeDTO.getDateOfBirth() : null;
        String profileImage = (employeeDTO.getProfileImage() != null) ? employeeDTO.getProfileImage() : "";
        Address address = (employeeDTO.getAddress() != null) ? employeeDTO.getAddress() : null;
        BloodGroup bloodGroup = (employeeDTO.getBloodGroup() != null) ? employeeDTO.getBloodGroup() : null;
        Company company = (employeeDTO.getCompany() != null) ? employeeDTO.getCompany() : null;
        Area area = (employeeDTO.getArea() != null) ? employeeDTO.getArea() : null;
        Boolean enabled = (employeeDTO.getEnabled() != null) ? employeeDTO.getEnabled() : false;
        
        
        employee.setId(id);
        employee.setName(name);
        employee.setLastName1(lastName1);
        employee.setLastName2(lastName2);
        employee.setGender(gender);
        employee.setMaritalStatus(maritalStatus);
        employee.setReligion(religion);
        employee.setRh(rh);
        employee.setOriginPlace(originPlace);
        employee.setPhone(phone);
        employee.setContactName(contactName);
        employee.setContactPhone(contactPhone);
        employee.setCreatedAt(createdAt);
        employee.setCreatedBy(createdBy);
        employee.setDateOfBirth(dateOfBirth);
        employee.setProfileImage(profileImage);
        employee.setAddress(address);
        employee.setBloodGroup(bloodGroup);
        employee.setCompany(company);
        employee.setArea(area);
        employee.setEnabled(enabled);
        
        return employee;
    }
    
    
	public static MedicalNoteDTO createMedicalNoteDTO(MedicalNote medicalNote){
		MedicalNoteDTO medicalNoteDTO = new MedicalNoteDTO();
		
		int mnIdDTO = (medicalNote.getId() > 0) ? medicalNote.getId() : 0;
		medicalNoteDTO.setId(mnIdDTO);
		
		String mnAnalisisDTO = (medicalNote.getAnalisis() != null) ? medicalNote.getAnalisis() : "-";
		medicalNoteDTO.setAnalisis(mnAnalisisDTO);
		
		int mnBloodPressureDTO = (medicalNote.getBloodPressure() > 0) ? medicalNote.getBloodPressure() : 0;
		medicalNoteDTO.setBloodPressure(mnBloodPressureDTO);
		
		int mnEmployeeIdDTO = (medicalNote.getEmployee_id() > 0) ? medicalNote.getEmployee_id() : 0;
		medicalNoteDTO.setEmployee_id(mnEmployeeIdDTO);
		
		String mnFindingsDTO = (medicalNote.getFindings() != null) ? medicalNote.getFindings() : "-";
		medicalNoteDTO.setFindings(mnFindingsDTO);
		
		int mnHeartRateDTO = (medicalNote.getHeartRate() > 0) ? medicalNote.getHeartRate() : 0;
		medicalNoteDTO.setHeartRate(mnHeartRateDTO);
		
		float mnHipsDTO = (medicalNote.getHips() > 0) ? medicalNote.getHips() : 0;
		medicalNoteDTO.setHips(mnHipsDTO);
		
		int mnRespiratoryRateDTO = (medicalNote.getRespiratoryRate() > 0) ? medicalNote.getRespiratoryRate() : 0;
		medicalNoteDTO.setRespiratoryRate(mnRespiratoryRateDTO);
		
		float mnSizeDTO = (medicalNote.getSize() > 0) ? medicalNote.getSize() : 0;
		medicalNoteDTO.setSize(mnSizeDTO);
		
		float mnTemperatureDTO = (medicalNote.getTemperature() > 0) ? medicalNote.getTemperature() : 0;
		medicalNoteDTO.setTemperature(mnTemperatureDTO);
		
		int mnTypeDTO = (medicalNote.getType() > 0) ? medicalNote.getType() : 0;
		medicalNoteDTO.setType(mnTypeDTO);
		
		String mnTreatementDTO = (medicalNote.getTreatment() != null) ? medicalNote.getTreatment() : "-";
		medicalNoteDTO.setTreatment(mnTreatementDTO);
		
		float mnWaistDTO = (medicalNote.getWaist() > 0) ? medicalNote.getWaist() : 0;
		medicalNoteDTO.setWaist(mnWaistDTO);
		
		float mnWeightDTO = (medicalNote.getWeight() > 0) ? medicalNote.getWeight() : 0;
		medicalNoteDTO.setWeight(mnWeightDTO);
		
		int mnWeightIndexDTO = (medicalNote.getWeightIndex() > 0) ? medicalNote.getWeightIndex() : 0;
		medicalNoteDTO.setWeightIndex(mnWeightIndexDTO);
		
		return medicalNoteDTO;
		
	}
	
	public static MedicalNote createMedicalNote(MedicalNoteDTO medicalNoteDTO){
		MedicalNote medicalNote = new MedicalNote();
		
		medicalNote.setId(medicalNoteDTO.getId());
		medicalNote.setAnalisis(medicalNoteDTO.getAnalisis());
		medicalNote.setBloodPressure(medicalNoteDTO.getBloodPressure());
		medicalNote.setEmployee_id(medicalNoteDTO.getEmployee_id());
		medicalNote.setFindings(medicalNoteDTO.getFindings());
		medicalNote.setHeartRate(medicalNoteDTO.getHeartRate());
		medicalNote.setHips(medicalNoteDTO.getHips());
		medicalNote.setRespiratoryRate(medicalNoteDTO.getRespiratoryRate());
		medicalNote.setSize(medicalNoteDTO.getSize());
		medicalNote.setTemperature(medicalNoteDTO.getTemperature());
		medicalNote.setType(medicalNoteDTO.getType());
		medicalNote.setTreatment(medicalNoteDTO.getTreatment());
		medicalNote.setWaist(medicalNoteDTO.getWaist());
		medicalNote.setWeight(medicalNoteDTO.getWeight());
		medicalNote.setWeightIndex(medicalNoteDTO.getWeightIndex());
		return medicalNote;
		
	}	
	
	public static CompanyDTO createCompanyDTO(Company company){
		CompanyDTO companyDTO = new CompanyDTO();
		
	    int id                         = (company.getId() > 0) ? company.getId() : 0;
	    String name                    = (company.getName() != null) ? company.getName() : "";
	    String bussinesName            = (company.getBussinesName() != null) ? company.getBussinesName() : "";
	    Integer employeeRegistration   = (company.getEmployeeRegistration() > 0 ) ? company.getEmployeeRegistration() : 0;
	    ActivityCompany activity       = (company.getActivity() != null) ? company.getActivity() : null;
	    Date createdAt                 = (company.getCreatedAt() != null) ? company.getCreatedAt() : null;
	    String main_doctor             = (company.getMain_doctor() != null) ? company.getMain_doctor() : "";
	    String createdBy               = (company.getCreatedBy() != null) ? company.getCreatedBy() : "";
	    Boolean enabled                = (company.getEnabled() != null) ? company.getEnabled() : null;
	    
	    companyDTO.setId(id);
	    companyDTO.setName(name);
	    companyDTO.setBussinesName(bussinesName);
	    companyDTO.setEmployeeRegistration(employeeRegistration);
	    companyDTO.setActivity(activity);
	    companyDTO.setCreatedAt(createdAt);
	    companyDTO.setMain_doctor(main_doctor);
	    companyDTO.setCreatedBy(createdBy);
	    companyDTO.setEnabled(enabled);
	    
	    return companyDTO;
		
	}	

	public static Company createCompany(CompanyDTO companyDTO){
		Company company = new Company();
		
        int id                         = (companyDTO.getId() > 0) ? companyDTO.getId() : 0;
        String name                    = (companyDTO.getName() != null) ? companyDTO.getName() : "";
        String bussinesName            = (companyDTO.getBussinesName() != null) ? companyDTO.getBussinesName() : "";
        Integer employeeRegistration   = (companyDTO.getEmployeeRegistration() > 0 ) ? companyDTO.getEmployeeRegistration() : 0;
        ActivityCompany activity       = (companyDTO.getActivity() != null) ? companyDTO.getActivity() : null;
        Date createdAt                 = (companyDTO.getCreatedAt() != null) ? companyDTO.getCreatedAt() : null;
        String main_doctor             = (companyDTO.getMain_doctor() != null) ? companyDTO.getMain_doctor() : "";
        String createdBy               = (companyDTO.getCreatedBy() != null) ? companyDTO.getCreatedBy() : "";
        Boolean enabled                = (companyDTO.getEnabled() != null) ? companyDTO.getEnabled() : null;
        
        company.setId(id);
        company.setName(name);
        company.setBussinesName(bussinesName);
        company.setEmployeeRegistration(employeeRegistration);
        company.setActivity(activity);
        company.setCreatedAt(createdAt);
        company.setMain_doctor(main_doctor);
        company.setCreatedBy(createdBy);
        company.setEnabled(enabled);

		return company;
	}
	
	public static FamilyHistoryDTO createFamilyHistoryDTO(FamilyHistory familyHistory){
		FamilyHistoryDTO familyHistoryDTO = new FamilyHistoryDTO();
		
		int fhIdDTO = (familyHistory.getId() > 0) ? familyHistory.getId() : 0;
		familyHistoryDTO.setId(fhIdDTO);
		
		int fhAgeDiseaseDTO = (familyHistory.getAgeDisease() > 0) ? familyHistory.getAgeDisease() : 0; 
		familyHistoryDTO.setAgeDisease(fhAgeDiseaseDTO);
		
		int fhAliveDTO = (familyHistory.getAlive() > 0) ? familyHistory.getAlive() : 0;
		familyHistoryDTO.setAlive(fhAliveDTO);
		
		int fhDiseaseDTO = (familyHistory.getDisease() > 0) ? familyHistory.getDisease() : 0;
		familyHistoryDTO.setDisease(fhDiseaseDTO);
		
		int fhEmployeeIdDTO = (familyHistory.getEmployee_id() > 0) ? familyHistory.getEmployee_id() : 0;
		familyHistoryDTO.setEmployee_id(fhEmployeeIdDTO);
		
		int fhRelativeDTO = (familyHistory.getRelative() > 0) ? familyHistory.getRelative() : 0;
		familyHistoryDTO.setRelative(fhRelativeDTO);
		
		String fhRemarksDTO = (familyHistory.getRemarks() != null) ? familyHistory.getRemarks() : "-";
		familyHistoryDTO.setRemarks(fhRemarksDTO);
		
		return familyHistoryDTO;
	}
	
	public static FamilyHistory createFamilyHistory(FamilyHistoryDTO familyHistoryDTO){
		FamilyHistory familyHistory = new FamilyHistory();
		
		familyHistory.setId(familyHistoryDTO.getId());
		familyHistory.setAgeDisease(familyHistoryDTO.getAgeDisease());
		familyHistory.setAlive(familyHistoryDTO.getAlive());
		familyHistory.setDisease(familyHistoryDTO.getDisease());
		familyHistory.setEmployee_id(familyHistoryDTO.getEmployee_id());
		familyHistory.setRelative(familyHistoryDTO.getRelative());
		familyHistory.setRemarks(familyHistoryDTO.getRemarks());
		
		return familyHistory;
	}	
	
    public static WorkBackgroundDTO createWorkBackgroundDTO(WorkBackground workBackground){
    	WorkBackgroundDTO workBackgroundDTO = new WorkBackgroundDTO();
    	
    	int wbIdDTO = (workBackground.getId() > 0) ? workBackground.getId() : 0;
    	workBackgroundDTO.setId(wbIdDTO);
    	
    	String wbNameDTO = (workBackground.getName() != null) ? workBackground.getName() : "-";
    	workBackgroundDTO.setName(wbNameDTO);
    	
    	String wbActivitiesDTO = (workBackground.getActivities() != null) ? workBackground.getActivities() : "-";
    	workBackgroundDTO.setActivities(wbActivitiesDTO);
    	
    	String wbAccidentsDTO = (workBackground.getAccidents() != null) ? workBackground.getAccidents() : "-";
    	workBackgroundDTO.setAccidents(wbAccidentsDTO);

    	String wbStartDateDTO = (workBackground.getStartDate() != null) ? workBackground.getStartDate() : "-";
    	workBackgroundDTO.setStartDate(wbStartDateDTO);
    	
    	String wbEndDateDTO = (workBackground.getEndDate() != null) ? workBackground.getEndDate() : "-";
    	workBackgroundDTO.setEndDate(wbEndDateDTO);
    	
    	String wbUserNameDTO = (workBackground.getUserName() != null) ? workBackground.getUserName() : "-";
    	workBackgroundDTO.setUserName(wbUserNameDTO);
    	
    	
    	int wbEmployeeIdDTO = (workBackground.getEmployeeId() > 0) ? workBackground.getEmployeeId() : 0;
    	workBackgroundDTO.setEmployeeId(wbEmployeeIdDTO);
    	
    	return workBackgroundDTO;
    }
    
    public static FamilyDiseaseDTO createFamilyDiseaseDTO(FamilyDisease familyDisease){
    	FamilyDiseaseDTO familyDiseaseDTO = new FamilyDiseaseDTO();
    	
    	int idFdDTO = (familyDisease.getId() > 0) ? familyDisease.getId() : 0;
    	familyDiseaseDTO.setId(idFdDTO);
    	
    	String nameFdDTO = (familyDisease.getName() != null) ? familyDisease.getName() : "-";
    	familyDiseaseDTO.setName(nameFdDTO);
    	
    	
    	
    	return familyDiseaseDTO;
    }
    
    public static MedicalHistoryDTO createMedicalHistoryDTO(MedicalHistory medicalHistory){
    	MedicalHistoryDTO medicalHistoryDTO = new MedicalHistoryDTO();
    	
    	int id = (medicalHistory.getId() > 0) ? medicalHistory.getId() : 0;
    	medicalHistoryDTO.setId(id);
    	
    	String currentCondition = (medicalHistory.getCurrentCondition() != null) ? medicalHistory.getCurrentCondition() : "";
    	medicalHistoryDTO.setCurrentCondition(currentCondition);

    	String analysis = (medicalHistory.getAnalysis() != null) ? medicalHistory.getAnalysis() : "";
    	medicalHistoryDTO.setAnalysis(analysis);
    	
    	String treatment = (medicalHistory.getTreatment() != null) ? medicalHistory.getTreatment() : "";
    	medicalHistoryDTO.setTreatment(treatment);
    	
    	String username = (medicalHistory.getCreatedBy() != null) ?  medicalHistory.getCreatedBy() : "";
    	medicalHistoryDTO.setCreatedBy(username);
    	
    	PhysicalExploration physicalExploration = (medicalHistory.getPhysicalExploration() != null) ? medicalHistory.getPhysicalExploration() : null;
    	medicalHistoryDTO.setPhysicalExploration(physicalExploration);
    	
    	Risk risk = (medicalHistory.getRisk() != null) ? medicalHistory.getRisk() : null;
    	medicalHistoryDTO.setRisk(risk);
    	
    	SexualActivity sexualActivity = (medicalHistory.getSexualActivity() != null) ? medicalHistory.getSexualActivity() : null;
    	medicalHistoryDTO.setSexualActivity(sexualActivity);
    	
    	return medicalHistoryDTO;
    }
    
    public static MedicalHistory createMedicalHistory(MedicalHistoryDTO medicalHistoryDTO){
        MedicalHistory medicalHistory = new MedicalHistory();
        
        int id = (medicalHistoryDTO.getId() > 0) ? medicalHistoryDTO.getId() : 0;
        medicalHistory.setId(id);
        
        String currentCondition = (medicalHistoryDTO.getCurrentCondition() != null) ? medicalHistoryDTO.getCurrentCondition() : "";
        medicalHistory.setCurrentCondition(currentCondition);

        String analysis = (medicalHistoryDTO.getAnalysis() != null) ? medicalHistoryDTO.getAnalysis() : "";
        medicalHistory.setAnalysis(analysis);
        
        String treatment = (medicalHistoryDTO.getTreatment() != null) ? medicalHistoryDTO.getTreatment() : "";
        medicalHistory.setTreatment(treatment);
        
        String username = (medicalHistoryDTO.getCreatedBy() != null) ?  medicalHistoryDTO.getCreatedBy() : "";
        medicalHistory.setCreatedBy(username);
        
        PhysicalExploration physicalExploration = (medicalHistoryDTO.getPhysicalExploration() != null) ? medicalHistoryDTO.getPhysicalExploration() : null;
        medicalHistory.setPhysicalExploration(physicalExploration);
        
        Risk risk = (medicalHistoryDTO.getRisk() != null) ? medicalHistoryDTO.getRisk() : null;
        medicalHistory.setRisk(risk);
        
        SexualActivity sexualActivity = (medicalHistoryDTO.getSexualActivity() != null) ? medicalHistoryDTO.getSexualActivity() : null;
        medicalHistory.setSexualActivity(sexualActivity);
        
        return medicalHistory;
    }    
    
    public static PersonalPathologicalsDTO createPersonalPathologicalsDTO(PersonalPathologicals personalPathologicals){
    	PersonalPathologicalsDTO personalPathologicalsDTO = new PersonalPathologicalsDTO();
    	
    	int idPersonalPathologicalsDTO = (personalPathologicals.getId() > 0) ? personalPathologicals.getId() : 0;
    	personalPathologicalsDTO.setId(idPersonalPathologicalsDTO);
    	
    	int examIdPersonalPathologicalDTO = (personalPathologicals.getExamId() > 0) ? personalPathologicals.getExamId() : 0;
    	personalPathologicalsDTO.setExamId(examIdPersonalPathologicalDTO);
    	
    	int examTypePersonalPathologicalDTO = (personalPathologicals.getExamType() > 0) ? personalPathologicals.getExamType() : 0;
    	personalPathologicalsDTO.setExamType(examTypePersonalPathologicalDTO);
    	
    	int valuePersonalPathologicalDTO = (personalPathologicals.getValue() > 0) ? personalPathologicals.getValue() : 0;
    	personalPathologicalsDTO.setValue(valuePersonalPathologicalDTO);
    	
    	String createdPersonalPathologicalDTO = (personalPathologicals.getCreatedAt() != null) ? personalPathologicals.getCreatedAt() : "-";
    	personalPathologicalsDTO.setCreatedAt(createdPersonalPathologicalDTO);

    	String remarksPersonalPathologicalDTO = (personalPathologicals.getRemarks() != null) ? personalPathologicals.getRemarks() : "-";
    	personalPathologicalsDTO.setRemarks(remarksPersonalPathologicalDTO);
    	
    	return personalPathologicalsDTO;
    }
    
    public static SexualActivityDTO createSexualActivityDTO(SexualActivity sexualActivity){
    	SexualActivityDTO sexualActivityDTO = new SexualActivityDTO();
    	
    	int idSADTO = (sexualActivity.getId() > 0) ? sexualActivity.getId() : 0;
    	sexualActivityDTO.setId(idSADTO);
    	
    	int examIdSADTO = (sexualActivity.getExamId() > 0) ? sexualActivity.getExamId() : 0;
    	sexualActivityDTO.setExamId(examIdSADTO);
    	
    	int examTypeSADTO = (sexualActivity.getExamType() > 0) ? sexualActivity.getExamType() : 0;
    	sexualActivityDTO.setExamType(examTypeSADTO);
    	
    	int ivsaSADTO = (sexualActivity.getIvsa() > 0) ? sexualActivity.getIvsa() : 0;
    	sexualActivityDTO.setIvsa(ivsaSADTO);
    	
    	int contraceptiveMethodSADTO = (sexualActivity.getContraceptiveMethod() > 0) ? sexualActivity.getContraceptiveMethod() : 0;
    	sexualActivityDTO.setContraceptiveMethod(contraceptiveMethodSADTO);
    	
    	int etsSADTO = (sexualActivity.getEts() > 0) ? sexualActivity.getEts() : 0;
    	sexualActivityDTO.setEts(etsSADTO);
    	
    	int menarcheSADTO = (sexualActivity.getMenarche() > 0) ? sexualActivity.getMenarche() : 0;
    	sexualActivityDTO.setMenarche(menarcheSADTO);
    	
    	int cyclesSADTO = (sexualActivity.getCycles() > 0 ) ? sexualActivity.getCycles() : 0;
    	sexualActivityDTO.setCycles(cyclesSADTO);
    	
    	int rhytmSADTO = (sexualActivity.getRhythm() > 0) ? sexualActivity.getRhythm() : 0;
    	sexualActivityDTO.setRhythm(rhytmSADTO);
    	
    	int pregnanciesSADTO = (sexualActivity.getPregnancies() > 0) ? sexualActivity.getPregnancies() : 0;
    	sexualActivityDTO.setPregnancies(pregnanciesSADTO);
    	
    	int stopsSADTO = (sexualActivity.getStops() > 0) ? sexualActivity.getStops() : 0;
    	sexualActivityDTO.setStops(stopsSADTO);
    	
    	int abortionsSADTO = (sexualActivity.getAbortions() > 0) ? sexualActivity.getAbortions() : 0;
    	sexualActivityDTO.setAbortions(abortionsSADTO);
    	
    	int csectionsSADTO = (sexualActivity.getCsections() > 0) ? sexualActivity.getCsections() : 0;
    	sexualActivityDTO.setCsections(csectionsSADTO);
    	
    	int menopauseSADTO = (sexualActivity.getMenopause() > 0) ? sexualActivity.getMenopause() : 0;
    	sexualActivityDTO.setMenopause(menopauseSADTO);
    	
    	String preventionSADTO = (sexualActivity.getPrevention() != null) ? sexualActivity.getPrevention() : "-";
    	sexualActivityDTO.setPrevention(preventionSADTO);
    	
    	int resultSADTO = (sexualActivity.getResult() > 0) ? sexualActivity.getResult() : 0;
    	sexualActivityDTO.setResult(resultSADTO);
    	
    	String createdAtSADTO = (sexualActivity.getCreatedAt() != null) ? sexualActivity.getCreatedAt() : "-";
    	sexualActivityDTO.setCreatedAt(createdAtSADTO);
    	   	
    	return sexualActivityDTO;
    }
    
    public static EmployeeRiskDTO createEmployeeRiskDTO(EmployeeRisk employeeRisk){
    	EmployeeRiskDTO employeeRiskDTO = new EmployeeRiskDTO();
    	
    	int idEmployeeRiskDTO = (employeeRisk.getId() > 0) ? employeeRisk.getId() : 0;
    	employeeRiskDTO.setId(idEmployeeRiskDTO);
    	
    	int examIdEmployeeRiskDTO = (employeeRisk.getExamId() > 0) ? employeeRisk.getExamId() : 0;
    	employeeRiskDTO.setExamId(examIdEmployeeRiskDTO);
    	
    	int valueEmployeeRiskDTO = (employeeRisk.getValue() > 0) ? employeeRisk.getValue() : 0;
    	employeeRiskDTO.setValue(valueEmployeeRiskDTO);
    	
    	String createdAtEmployeeRiskDTO = (employeeRisk.getCreatedAt() != null) ? employeeRisk.getCreatedAt() : "-";
    	employeeRiskDTO.setCreatedAt(createdAtEmployeeRiskDTO);
    	
    	int employeeIdEmployeeRiskDTO = (employeeRisk.getEmployeeId() > 0) ? employeeRisk.getEmployeeId() : 0;
    	employeeRiskDTO.setEmployeeId(employeeIdEmployeeRiskDTO);
    	
    	return employeeRiskDTO;
    }
    
    public static PhysicalExplorationDTO createPhysicalExplorationDTO(PhysicalExploration physicalExploration){
    	PhysicalExplorationDTO physicalExplorationDTO = new PhysicalExplorationDTO();
    	
    	int examIdPEDTO = (physicalExploration.getExamId() > 0) ? physicalExploration.getExamId() : 0;
        physicalExplorationDTO.setExamId(examIdPEDTO);
        
        int examTypePEDTO = (physicalExploration.getExamType() > 0) ? physicalExploration.getExamType() : 0;
        physicalExplorationDTO.setExamType(examTypePEDTO);
        
        int heartRatePEDTO = (physicalExploration.getHeartRate() > 0) ? physicalExploration.getHeartRate() : 0;
        physicalExplorationDTO.setHeartRate(heartRatePEDTO);
        
        int bloodPressurePEDTO = (physicalExploration.getBloodPressure() > 0) ? physicalExploration.getBloodPressure() : 0;
        physicalExplorationDTO.setBloodPressure(bloodPressurePEDTO);
        
        int respiratoryRatePEDTO = (physicalExploration.getRespiratoryRate() > 0) ? physicalExploration.getRespiratoryRate() : 0;
        physicalExplorationDTO.setRespiratoryRate(respiratoryRatePEDTO);
        
        float temperaturePEDTO = (physicalExploration.getTemperature() > 0) ? physicalExploration.getTemperature() : 0;
        physicalExplorationDTO.setTemperature(temperaturePEDTO);
        
        float weightPEDTO = (physicalExploration.getWeight() > 0) ? physicalExploration.getWeight() : 0;
        physicalExplorationDTO.setWeight(weightPEDTO);
        
        float sizePEDTO = (physicalExploration.getSize() > 0) ? physicalExploration.getSize() : 0;
        physicalExplorationDTO.setSize(sizePEDTO);
        
        int weightIndexPEDTO = (physicalExploration.getWeightIndex() > 0) ? physicalExploration.getWeightIndex() : 0;
        physicalExplorationDTO.setWeightIndex(weightIndexPEDTO);
        
        float imcPEDTO = (physicalExploration.getImc() > 0) ? physicalExploration.getImc() : 0;
        physicalExplorationDTO.setImc(imcPEDTO);
        
        float waistPEDTO = (physicalExploration.getWaist() > 0) ? physicalExploration.getWaist() : 0;
        physicalExplorationDTO.setWaist(waistPEDTO);
        
        float hipsPEDTO = (physicalExploration.getHips() > 0) ? physicalExploration.getHips() : 0;
        physicalExplorationDTO.setHips(hipsPEDTO);
        
        String generalPEDTO = (physicalExploration.getGeneral() != null) ? physicalExploration.getGeneral() : "-";
        physicalExplorationDTO.setGeneral(generalPEDTO);
        
        String headPEDTO = (physicalExploration.getHead() != null) ? physicalExploration.getHead() : "-";
        physicalExplorationDTO.setHead(headPEDTO);
        
        String toraxPEDTO = (physicalExploration.getTorax() != null) ? physicalExploration.getTorax() : "-";
        physicalExplorationDTO.setTorax(toraxPEDTO);
        
        String abdomenPEDTO = (physicalExploration.getAbdomen() != null) ? physicalExploration.getAbdomen() : "-";
        physicalExplorationDTO.setAbdomen(abdomenPEDTO);
        
        String limbsPEDTO = (physicalExploration.getLimbs() != null) ? physicalExploration.getLimbs() : "-";
        physicalExplorationDTO.setLimbs(limbsPEDTO);
        
        String genitalsPEDTO = (physicalExploration.getGenitals() != null) ? physicalExploration.getGenitals() : "-";
        physicalExplorationDTO.setGenitals(genitalsPEDTO);
        
        String nervousSystemPEDTO = (physicalExploration.getNervousSystem() != null) ? physicalExploration.getNervousSystem() : "-";
        physicalExplorationDTO.setNervousSystem(nervousSystemPEDTO);
        
        String createdAtPEDTO = (physicalExploration.getCreatedAt() != null) ? physicalExploration.getCreatedAt() : "-";
        physicalExplorationDTO.setCreatedAt(createdAtPEDTO);
        
        
    	return physicalExplorationDTO;
    }
    
    public static MedicalExamDTO createMedicalExamDTO(MedicalExam medicalExam){
    	MedicalExamDTO medicalExamDTO = new MedicalExamDTO();
    	
    	int idMEDTO = (medicalExam.getId() > 0) ? medicalExam.getId() : 0;
    	medicalExamDTO.setId(idMEDTO);
    	
    	int employeeIdMEDTO = (medicalExam.getEmployeeId() > 0) ? medicalExam.getEmployeeId() : 0;
    	medicalExamDTO.setEmployeeId(employeeIdMEDTO);
    	
    	int userIdMEDTO = (medicalExam.getUserId() > 0) ? medicalExam.getUserId() : 0;
    	medicalExamDTO.setUserId(userIdMEDTO);
    	
    	int motiveMEDTO = (medicalExam.getMotive() > 0) ? medicalExam.getMotive() : 0;
    	medicalExamDTO.setMotive(motiveMEDTO);
    	
    	int typeMEDTO = (medicalExam.getType() > 0) ? medicalExam.getType() : 0;
    	medicalExamDTO.setType(typeMEDTO);
    	
    	String findingsMEDTO = (medicalExam.getFindings() != null) ? medicalExam.getFindings() : "-";
    	medicalExamDTO.setFindings(findingsMEDTO);
    	
    	String analisisMEDTO = (medicalExam.getAnalisis() != null) ? medicalExam.getAnalisis() : "-";
    	medicalExamDTO.setAnalisis(analisisMEDTO);
    	
    	String treatmentMEDTO = (medicalExam.getTreatment() != null) ? medicalExam.getTreatment() : "-";
    	medicalExamDTO.setTreatment(treatmentMEDTO);
    	
    	String createdAtMEDTO = (medicalExam.getCreatedAt() != null) ? medicalExam.getCreatedAt() : "-";
    	medicalExamDTO.setCreatedAt(createdAtMEDTO);
    	
    	return medicalExamDTO;
    }
    
    public static AreaDTO createAreaDTO(Area area){
        
        AreaDTO areaDTO = new AreaDTO();
        
        int id = (area.getId() > 0) ? area.getId() : 0; 
        String name = (area.getName() != null) ? area.getName() : "";
        String createdAt = (area.getCreatedAt() != null) ? area.getCreatedAt() : "";
        String createdBy = (area.getCreatedBy() != null) ? area.getCreatedBy() : "";
        Company company = (area.getCompany() != null) ? area.getCompany() : null;
        Boolean enabled = (area.getEnabled() != null) ? area.getEnabled() : null;
        
        areaDTO.setId(id);
        areaDTO.setName(name);
        areaDTO.setCreatedAt(createdAt);
        areaDTO.setCreatedAt(createdAt);
        areaDTO.setCreatedBy(createdBy);
        areaDTO.setCompany(company);
        areaDTO.setEnabled(enabled);
        
        return areaDTO;
        
    }
    
    public static Area createArea(AreaDTO areaDTO){
        
        Area area = new Area();
        
        int id = (areaDTO.getId() > 0) ? areaDTO.getId() : 0; 
        String name = (areaDTO.getName() != null) ? areaDTO.getName() : "";
        String createdAt = (areaDTO.getCreatedAt() != null) ? areaDTO.getCreatedAt() : "";
        String createdBy = (areaDTO.getCreatedBy() != null) ? areaDTO.getCreatedBy() : "";
        Company company = (areaDTO.getCompany() != null) ? areaDTO.getCompany() : null;
        Boolean enabled = (areaDTO.getEnabled() != null) ? area.getEnabled() : null;
        
        area.setId(id);
        area.setName(name);
        area.setCreatedAt(createdAt);
        area.setCreatedAt(createdAt);
        area.setCreatedBy(createdBy);
        area.setCompany(company);
        area.setEnabled(enabled);
        
        return area;
        
    }    
    

    public static UserDTO createUserDTO(User user){
        
        UserDTO userDTO = new UserDTO();
        
        String password     = (user.getPassword() != null) ? user.getPassword() : "";
        Boolean enabled     = (user.getEnabled() != null) ? user.getEnabled() : null;
        String name         = (user.getName() != null) ? user.getName() : "";
        String firstname    = (user.getFirstname() != null) ? user.getFirstname() : "";
        String lastname     = (user.getLastname() != null) ? user.getLastname() : "";
        String email        = (user.getEmail() != null) ? user.getEmail() : "";
        String username     = (user.getUsername() != null) ? user.getUsername() : "";
        Date createdAt      = (user.getCreatedAt() != null) ? user.getCreatedAt() : null;
        String createdBy    = (user.getCreatedBy() != null) ? user.getCreatedBy() : "";
        Company company     = (user.getCompany() != null) ? user.getCompany() : null;
        
        userDTO.setPassword(password);
        userDTO.setEnabled(enabled);
        userDTO.setName(name);
        userDTO.setFirstname(firstname);
        userDTO.setLastname(lastname);
        userDTO.setEmail(email);
        userDTO.setUsername(username);
        userDTO.setCreatedAt(createdAt);
        userDTO.setCreatedBy(createdBy);
        userDTO.setCompany(company);
        
        return userDTO;
        
    }
    
    public static User createUser(UserDTO userDTO){
        
        User user = new User();
        
        String password     = (userDTO.getPassword() != null) ? userDTO.getPassword() : "";
        Boolean enabled     = (userDTO.getEnabled() != null) ? userDTO.getEnabled() : null;
        String name         = (userDTO.getName() != null) ? userDTO.getName() : "";
        String firstname    = (userDTO.getFirstname() != null) ? userDTO.getFirstname() : "";
        String lastname     = (userDTO.getLastname() != null) ? userDTO.getLastname() : "";
        String email        = (userDTO.getEmail() != null) ? userDTO.getEmail() : "";
        String username     = (userDTO.getUsername() != null) ? userDTO.getUsername() : "";
        Date createdAt      = (userDTO.getCreatedAt() != null) ? userDTO.getCreatedAt() : null;
        String createdBy    = (userDTO.getCreatedBy() != null) ? userDTO.getCreatedBy() : "";
        Company company     = (userDTO.getCompany() != null) ? userDTO.getCompany() : null;
        
        user.setPassword(password);
        user.setEnabled(enabled);
        user.setName(name);
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setEmail(email);
        user.setUsername(username);
        user.setCreatedAt(createdAt);
        user.setCreatedBy(createdBy);
        user.setCompany(company);
        
        return user;
        
    }    
    
    
    public static ActivityCompanyDTO createActivityCompanyDTO(ActivityCompany activityCompany){
        ActivityCompanyDTO activityCompanyDTO = new ActivityCompanyDTO();
        
        int id = (activityCompany.getId() > 0) ? activityCompany.getId() : 0;
        String activity = (activityCompany.getActivity() != null) ? activityCompany.getActivity() : "";
        
        activityCompanyDTO.setId(id);
        activityCompanyDTO.setActivity(activity);;
        
        return activityCompanyDTO;
    }
    
    public static ActivityCompany createActivityCompany(ActivityCompanyDTO activityCompanyDTO){
        ActivityCompany activityCompany = new ActivityCompany();
        
        int id = (activityCompanyDTO.getId() > 0) ? activityCompanyDTO.getId() : 0;
        String activity = (activityCompanyDTO.getActivity() != null) ? activityCompanyDTO.getActivity() : "";
        
        activityCompany.setId(id);
        activityCompany.setActivity(activity);;
        
        return activityCompany;
    }
    
    public static BloodGroupDTO createBloodGroupDTO(BloodGroup bloodGroup){
        BloodGroupDTO bloodGroupDTO = new BloodGroupDTO();
        
        int id = (bloodGroup.getId() > 0) ? bloodGroup.getId() : 0;
        String group = (bloodGroup.getGroup() != null) ? bloodGroup.getGroup() : "";
        
        bloodGroupDTO.setId(id);
        bloodGroupDTO.setGroup(group);
        
        return bloodGroupDTO;
    }
    
    public static BloodGroup createBloodGroup(BloodGroupDTO bloodGroupDTO){
        BloodGroup bloodGroup = new BloodGroup();
        
        int id = (bloodGroupDTO.getId() > 0) ? bloodGroupDTO.getId() : 0;
        String group = (bloodGroupDTO.getGroup() != null) ? bloodGroupDTO.getGroup() : "";
        
        bloodGroup.setId(id);
        bloodGroup.setGroup(group);
        
        return bloodGroup;
    }    
    
    public static BodySystemDTO createBodySystemDTO(BodySystem bodySystemObject){
        BodySystemDTO bodySystemDTO = new BodySystemDTO();
        
        int id = (bodySystemObject.getId() > 0) ? bodySystemObject.getId() : 0;
        TypeBodySystem type = (bodySystemObject.getType() != null) ? bodySystemObject.getType() : null;
        String bodySystem = (bodySystemObject.getBodySystem() != null) ? bodySystemObject.getBodySystem() : "";
        
        bodySystemDTO.setBodySystem(bodySystem);
        bodySystemDTO.setId(id);
        bodySystemDTO.setType(type);
        
        return bodySystemDTO;
    }
    
    public static BodySystem createBodySystem(BodySystemDTO bodySystemDTO){
        BodySystem bodySystemObject = new BodySystem();
        
        int id = (bodySystemDTO.getId() > 0) ? bodySystemDTO.getId() : 0;
        TypeBodySystem type = (bodySystemDTO.getType() != null) ? bodySystemDTO.getType() : null;
        String bodySystem = (bodySystemDTO.getBodySystem() != null) ? bodySystemDTO.getBodySystem() : "";
        
        bodySystemObject.setBodySystem(bodySystem);
        bodySystemObject.setId(id);
        bodySystemObject.setType(type);
        
        return bodySystemObject;
    }    
    
    public static DiagnosisDTO createDiagnosisDTO(Diagnosis diagnosis){
        DiagnosisDTO diagnosisDTO = new DiagnosisDTO();
        
        int id = (diagnosis.getId() > 0) ? diagnosis.getId() : 0;
        TypeDiagnosis type = (diagnosis.getType() != null) ? diagnosis.getType() : null;
        String name = (diagnosis.getName() != null) ? diagnosis.getName() : "";
        
        diagnosisDTO.setId(id);
        diagnosisDTO.setType(type);
        diagnosisDTO.setName(name);
        
        return diagnosisDTO;
    }
    
    public static Diagnosis createDiagnosis(DiagnosisDTO diagnosisDTO){
        Diagnosis diagnosis = new Diagnosis();
        
        int id = (diagnosisDTO.getId() > 0) ? diagnosisDTO.getId() : 0;
        TypeDiagnosis type = (diagnosisDTO.getType() != null) ? diagnosisDTO.getType() : null;
        String name = (diagnosisDTO.getName() != null) ? diagnosisDTO.getName() : "";
        
        diagnosis.setId(id);
        diagnosis.setType(type);
        diagnosis.setName(name);
        
        return diagnosis;
    }    
    
    public static TypeBodySystemDTO createTypeBodySystemDTO(TypeBodySystem typeBodySystem){
        TypeBodySystemDTO typeBodySystemDTO = new TypeBodySystemDTO();
        
        int idDTO = (typeBodySystem.getId() > 0) ? typeBodySystem.getId() : 0;
        String typeBodySystemStringDTO = (typeBodySystem.getTypeBodySystem() != null) ? typeBodySystem.getTypeBodySystem() : "";
        
        typeBodySystemDTO.setId(idDTO);
        typeBodySystemDTO.setTypeBodySystem(typeBodySystemStringDTO);
        
        return typeBodySystemDTO;
    }
    
    public static TypeBodySystem createTypeBodySystem(TypeBodySystemDTO typeBodySystemDTO){
        TypeBodySystem typeBodySystem = new TypeBodySystem();
        
        int id = (typeBodySystemDTO.getId() > 0) ? typeBodySystemDTO.getId() : 0;
        String typeBodySystemString = (typeBodySystemDTO.getTypeBodySystem() != null) ? typeBodySystemDTO.getTypeBodySystem() : "";
        
        typeBodySystemDTO.setId(id);
        typeBodySystemDTO.setTypeBodySystem(typeBodySystemString);
        
        return typeBodySystem;
    }    
    
    public static RiskDTO createRiskDTO(Risk risk){
        RiskDTO riskDTO = new RiskDTO();
        
        int id = (risk.getId() > 0) ? risk.getId() : 0;
        String risk_level = (risk.getRiskLevel() != null) ? risk.getRiskLevel() : "";
        
        riskDTO.setId(id);
        riskDTO.setRiskLevel(risk_level);
        
        return riskDTO;
    }
    
    public static Risk createRisk(RiskDTO riskDTO){
        Risk risk = new Risk();
        
        int id = (riskDTO.getId() > 0) ? riskDTO.getId() : 0;
        String risk_level = (riskDTO.getRiskLevel() != null) ? riskDTO.getRiskLevel() : "";
        
        risk.setId(id);
        risk.setRiskLevel(risk_level);
        
        return risk;
    }    
	
}
