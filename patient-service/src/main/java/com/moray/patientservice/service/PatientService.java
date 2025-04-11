package com.moray.patientservice.service;

import com.moray.patientservice.dto.PatientResponseDTO;
import com.moray.patientservice.model.Patient;

import java.util.List;

public interface PatientService {

    List<PatientResponseDTO> getPatients();

}
