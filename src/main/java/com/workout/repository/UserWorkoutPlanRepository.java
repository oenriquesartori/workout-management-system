package com.workout.repository;

import com.workout.entity.UserWorkoutPlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserWorkoutPlanRepository extends JpaRepository<UserWorkoutPlan, Long> {
}
