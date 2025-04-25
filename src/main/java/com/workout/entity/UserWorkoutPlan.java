package com.workout.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "workout_sheet")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserWorkoutPlan {
}
