package com.training.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.training.model.StudentMarksEntity;

import com.training.service.MarksService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class MarksController {
	@Autowired
	MarksService markservice;

	@GetMapping("/student/marks")
	public List<StudentMarksEntity> getmarks() {
		return markservice.getmarks();
	}
	@GetMapping("/student/{id}/marks")
	public StudentMarksEntity getmarksbyId(@PathVariable Integer id) {
		return markservice.getmarksbyId(id);
	}

}

