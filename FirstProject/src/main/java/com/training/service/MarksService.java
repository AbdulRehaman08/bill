package com.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.model.StudentMarksEntity;
import com.training.repo.MarksRepo;

@Service
public class MarksService {
	@Autowired
	MarksRepo marksrepo;

	public List<StudentMarksEntity> getmarks() {

		return marksrepo.findAll();
	}

	public StudentMarksEntity getmarksbyId(Integer i) {
		Optional<StudentMarksEntity> entity =  marksrepo.findById(i);
		if(entity.isPresent()) {
			return entity.get();
		}
		else
		{
			return null;
		}	
	}

}
