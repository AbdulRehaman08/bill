package com.training.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "student", schema = "app")
public class StudentEntity {

	@Id
	@Column
	private int studentId;

	@Column
	private String name;

	@Column
	@Temporal(TemporalType.DATE)
	private Date dob;

	@Column
	private String yoa;

	@OneToOne
	@JoinColumn(name = "studentId", referencedColumnName = "studentId")
	private ContactEntity contact;

	@OneToOne
	@JoinColumn(name = "studentId", referencedColumnName = "studentId")
	private StudentMarksEntity marks;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getYoa() {
		return yoa;
	}

	public void setYoa(String yoa) {
		this.yoa = yoa;
	}

	public ContactEntity getContact() {
		return contact;
	}

	public void setContact(ContactEntity contact) {
		this.contact = contact;
	}

	public StudentMarksEntity getMarks() {
		return marks;
	}

	public void setMarks(StudentMarksEntity marks) {
		this.marks = marks;
	}

}
//entity 1 entity for 1 table
//dto - data transfer objects - pages