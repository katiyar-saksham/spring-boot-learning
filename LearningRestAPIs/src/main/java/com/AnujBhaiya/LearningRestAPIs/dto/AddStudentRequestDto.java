package com.AnujBhaiya.LearningRestAPIs.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //replace boilerPlate code commented below
//@AllArgsConstructor //all arguments ka constructor automatically bna dia hai teeno field wale
//@NoArgsConstructor
public class AddStudentRequestDto {
    //    private Long id;
    @NotBlank(message = "Name is Required")
    @Size(min = 3, max = 30)
    private String name;

    @Email
    @NotBlank(message = "Email is required")
    private String email;

}
