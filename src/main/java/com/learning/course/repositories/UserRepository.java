package com.learning.course.repositories;

import com.learning.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { }
