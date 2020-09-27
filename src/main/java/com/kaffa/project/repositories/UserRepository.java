package com.kaffa.project.repositories;

import com.kaffa.project.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
