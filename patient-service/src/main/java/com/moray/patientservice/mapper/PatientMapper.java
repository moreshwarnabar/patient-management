package com.moray.patientservice.mapper;

import com.moray.patientservice.dto.PatientResponseDTO;
import com.moray.patientservice.model.Patient;

public class PatientMapper {

    public static PatientResponseDTO toDTO(Patient patient) {
        PatientResponseDTO patientDTO = new PatientResponseDTO();

        patientDTO.setId(patient.getId().toString());
        patientDTO.setFirstName(patient.getFirstName());
        patientDTO.setLastName(patient.getLastName());
        patientDTO.setEmail(patient.getEmail());
        patientDTO.setAddress(patient.getAddress());
        patientDTO.setDateOfBirth(patientDTO.getDateOfBirth());

        return patientDTO;
    }

}
