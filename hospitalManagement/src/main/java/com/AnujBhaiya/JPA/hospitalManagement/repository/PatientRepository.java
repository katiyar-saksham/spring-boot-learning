package com.AnujBhaiya.JPA.hospitalManagement.repository;

import com.AnujBhaiya.JPA.hospitalManagement.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
