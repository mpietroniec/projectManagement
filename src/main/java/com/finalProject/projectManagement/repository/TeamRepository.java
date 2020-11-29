package com.finalProject.projectManagement.repository;

import com.finalProject.projectManagement.model.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team,Long> {
}
