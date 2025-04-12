package com.moray.patientservice.service;

import com.moray.patientservice.dto.PatientRequestDTO;
import com.moray.patientservice.dto.PatientResponseDTO;
import com.moray.patientservice.model.Patient;

import java.util.List;
import java.util.UUID;

public interface PatientService {

    List<PatientResponseDTO> getPatients();

    PatientResponseDTO createPatient(PatientRequestDTO patientRequestDTO);

    PatientResponseDTO updatePatient(UUID id, PatientRequestDTO patientRequestDTO);

}
