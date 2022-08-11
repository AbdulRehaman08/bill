package com.training.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.training.dto.StudentSearchDTO;
import com.training.model.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity,Integer>{

	@Query("select s.studentId as studentId,s.name as name from StudentEntity s")
	public List<StudentSearchDTO> getStudents();

}
