package com.workout.entity;

import jakarta.persistence.*;
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate birthDate;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Double height;
    private Double weight;
    private LocalDate startDate;
    private String objective;
}
