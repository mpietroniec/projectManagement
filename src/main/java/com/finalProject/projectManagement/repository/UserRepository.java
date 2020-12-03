package com.finalProject.projectManagement.repository;

import com.finalProject.projectManagement.model.entity.Holder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Holder, Long> {
}
