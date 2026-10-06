package com.AnujBhaiya.JPA.hospitalManagement;

import com.AnujBhaiya.JPA.hospitalManagement.entity.Patient;
import com.AnujBhaiya.JPA.hospitalManagement.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@SpringBootTest
public class PatientTests {

    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void testPatientRepository() {

        List<Patient> patientList = patientRepository.findAll();
        System.out.println(patientList);
    }
}
