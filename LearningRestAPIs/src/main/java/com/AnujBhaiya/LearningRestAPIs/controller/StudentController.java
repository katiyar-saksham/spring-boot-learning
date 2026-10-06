package com.AnujBhaiya.LearningRestAPIs.controller;

import com.AnujBhaiya.LearningRestAPIs.dto.AddStudentRequestDto;
import com.AnujBhaiya.LearningRestAPIs.dto.StudentDto;
import com.AnujBhaiya.LearningRestAPIs.entity.Student;
import com.AnujBhaiya.LearningRestAPIs.repository.StudentRepository;
import com.AnujBhaiya.LearningRestAPIs.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students") //for all methods
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<List<StudentDto>> getAllStudents() {
//        return ResponseEntity.status(HttpStatus.OK).body(studentService.getAllStudent());
        return ResponseEntity.ok(studentService.getAllStudent());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable Long id) {
//        return studentService.getStudentById(id);
        return ResponseEntity.ok(studentService.getStudentById(id));
    }


    @PostMapping
    public ResponseEntity<StudentDto> createNewStudent(@RequestBody @Valid AddStudentRequestDto addStudentRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudent(addStudentRequestDto));
    }
}





