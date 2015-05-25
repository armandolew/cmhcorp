package com.medem.model;

import org.springframework.web.multipart.MultipartFile;

public class FileUpload {

	private MultipartFile file;
	private int employeeId;

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	
}
