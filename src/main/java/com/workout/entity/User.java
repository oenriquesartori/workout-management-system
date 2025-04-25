package com.workout.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private Long id;
    private String name;
    private LocalDate birthDate;
    private Gender gender;
    private Double height;
    private Double weight;
    private LocalDate startDate;
    private String objective;

}
