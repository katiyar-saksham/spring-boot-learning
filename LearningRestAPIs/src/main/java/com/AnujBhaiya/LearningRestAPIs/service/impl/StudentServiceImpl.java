package com.AnujBhaiya.LearningRestAPIs.service.impl;

import com.AnujBhaiya.LearningRestAPIs.dto.AddStudentRequestDto;
import com.AnujBhaiya.LearningRestAPIs.dto.StudentDto;
import com.AnujBhaiya.LearningRestAPIs.entity.Student;
import com.AnujBhaiya.LearningRestAPIs.repository.StudentRepository;
import com.AnujBhaiya.LearningRestAPIs.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto) {
        Student newStudent = modelMapper.map(addStudentRequestDto, Student.class);
        Student student = studentRepository.save(newStudent);

        return modelMapper.map(student,StudentDto.class);
    }

    @Override
    public List<StudentDto> getAllStudent() {
        List<Student> students = studentRepository.findAll();

        return students
                .stream()
                .map(student -> new StudentDto(student.getId(), student.getName(), student.getEmail())).toList();
    }

    @Override
    public StudentDto getStudentById(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student not found with this ID: " + id));
        return modelMapper.map(student, StudentDto.class);

//        return studentDto;
    }
}
