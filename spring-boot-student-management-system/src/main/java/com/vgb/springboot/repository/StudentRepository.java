package com.vgb.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vgb.springboot.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
