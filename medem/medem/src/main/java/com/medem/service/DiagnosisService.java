package com.medem.service;

import java.util.List;

import com.medem.dto.DiagnosisDTO;

public interface DiagnosisService {

    public List<DiagnosisDTO> listDiagnosis() throws Exception;
}
