package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.dto.StudentSearchDTO;
import com.training.model.StudentEntity;
import com.training.service.StudentSearchService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class StudentController {

	@Autowired
	StudentSearchService service;

	@GetMapping("/")
	public String Welcome() {
		return "Welcome to backend service for college management";
	}
	
	@GetMapping("/students")
	public List<StudentSearchDTO> getStudents() {
		return service.getStudents();
	}
//	api should be noun not verb

	@GetMapping("/student/{id}")
	public StudentEntity getstudentbyId(@PathVariable Integer id) {
		return service.getstudentbyId(id);
	}

	// browser only excepts GET so DELETE will give fallback so.
	// use postman or thunderclient for DELETE API
	@DeleteMapping("/student/{id}")
	public void deletebyId(@PathVariable Integer id) {
		service.deletestudentbyId(id);
	}

	@PostMapping("/studentinsert")
	public void insertstudent(StudentEntity student) {
		service.saveStudent(student);
	}

	@PutMapping("/students")
	public void updatestudent(StudentEntity student) {
		service.saveStudent(student);
	}

}
