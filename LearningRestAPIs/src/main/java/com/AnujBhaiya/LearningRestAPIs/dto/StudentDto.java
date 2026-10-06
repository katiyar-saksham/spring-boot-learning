package com.AnujBhaiya.LearningRestAPIs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //replace boilerPlate code commented below
@AllArgsConstructor //all arguments ka constructor automatically bna dia hai teeno field wale
@NoArgsConstructor
public class StudentDto {
    private Long id;
    private String name;
    private String email;

//    public StudentDto(Long id, String name, String email) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//    }
//
//    public StudentDto() {
//    }
}
