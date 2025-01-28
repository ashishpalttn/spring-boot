package com.example.demo_app.repository;

import com.example.demo_app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
