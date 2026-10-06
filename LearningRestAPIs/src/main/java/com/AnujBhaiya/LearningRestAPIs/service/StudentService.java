package com.AnujBhaiya.LearningRestAPIs.service;

import com.AnujBhaiya.LearningRestAPIs.dto.AddStudentRequestDto;
import com.AnujBhaiya.LearningRestAPIs.dto.StudentDto;

import java.util.List;

public interface StudentService {

    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);

    List<StudentDto> getAllStudent();

    StudentDto getStudentById(Long id);
}
