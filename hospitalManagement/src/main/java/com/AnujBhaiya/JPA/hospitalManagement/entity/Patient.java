package com.AnujBhaiya.JPA.hospitalManagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.security.PrivateKey;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@ToString
@Getter
@Setter
@Table(
        name = "patient_tbl",
        uniqueConstraints = {
//                @UniqueConstraint(
//                        name = "patient_mail",
//                        columnNames = {"email"}
//                ),
                @UniqueConstraint(
                        name = "patient_name_birthdate",
                        columnNames = {"name", "birth_date"}
                )
        },
        indexes = {
                @Index(
                        name = "idx_patient_birth_date",
                        columnList = "birth_date"
                )
        }
)


public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "patient_name")
    private String name;

    @ToString.Exclude
    private LocalDate birthDate;

    @Column(unique = true)
    private String email;

    private String gender;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

}