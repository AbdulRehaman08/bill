package com.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.dto.StudentSearchDTO;
import com.training.model.StudentEntity;
import com.training.repo.StudentRepo;

@Service
public class StudentSearchService {

	@Autowired
	StudentRepo repo;

	public List<StudentSearchDTO> getStudents() {
//		List<StudentSearchDTO> students = new ArrayList<>();
//		List<StudentEntity> entities = repo.findAll();
//		for (StudentEntity entity : entities) {
//			StudentSearchDTO student = new StudentSearchDTO();
//			student.setStudentId("" + entity.getStudentId());
//			student.setName(entity.getName());
//			students.add(student);
//		}
		return repo.getStudents();
	}

	public StudentEntity getstudentbyId(Integer i) {
		Optional<StudentEntity> entity = repo.findById(i);
		if (entity.isPresent()) {
			return entity.get();
		} else {
			return null;
		}
	}

	public void deletestudentbyId(Integer id) {
		repo.deleteById(id);
	}

	public void saveStudent(StudentEntity student) {
		repo.save(student);
	}

	public void deleteStudent(StudentEntity student) {
		repo.delete(student);

	}
}
