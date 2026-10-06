package com.AnujBhaiya.JPA.hospitalManagement.service;

import com.AnujBhaiya.JPA.hospitalManagement.entity.Patient;
import com.AnujBhaiya.JPA.hospitalManagement.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;

    @Transactional
    public Patient getPatientById(Long id) {

        Patient p1 = patientRepository.findById(id).orElseThrow();

        Patient p2 = patientRepository.findById(id).orElseThrow();

        p1.setName("SAXAM");
//        System.out.println(p1 == p2);

//        patientRepository.save(p1);
        return p1;
    }
}
