package com.example.Microservice.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Long>{

   @Query
   Optional<Student> findStudentByEmail(String email);
    
}
