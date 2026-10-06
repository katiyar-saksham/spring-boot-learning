package com.AnujBhaiya.LearningRestAPIs.repository;

import com.AnujBhaiya.LearningRestAPIs.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
