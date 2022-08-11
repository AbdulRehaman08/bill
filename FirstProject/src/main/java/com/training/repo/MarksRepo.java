package com.training.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.model.StudentMarksEntity;

@Repository
public interface MarksRepo extends JpaRepository<StudentMarksEntity, Integer> {

}