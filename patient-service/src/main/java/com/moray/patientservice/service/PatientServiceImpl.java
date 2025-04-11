package com.moray.patientservice.service;

import com.moray.patientservice.dto.PatientResponseDTO;
import com.moray.patientservice.mapper.PatientMapper;
import com.moray.patientservice.model.Patient;
import com.moray.patientservice.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<PatientResponseDTO> getPatients() {
        List<Patient> patients = patientRepository.findAll();

        return patients.stream()
                .map(PatientMapper::toDTO).toList();
    }

}
