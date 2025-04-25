package com.workout.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "training")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Training {
}
