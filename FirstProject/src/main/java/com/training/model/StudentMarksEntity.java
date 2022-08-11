package com.training.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "student_marks", schema = "app")
public class StudentMarksEntity {

	@Id
	@Column
	private int studentId;

	@Column
	private int maths;

	@Column
	private int physics;

	@Column
	private int chemistry;

	@Transient
	private float percentage;

	@Transient
	private String result;	

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public float getPercentage() {
		int sum = this.maths + this.physics + this.chemistry;
		this.percentage = (((float) sum / 300))*100;
		return this.percentage;
	}

	public String getResult() {
		if (this.percentage >= 60) {
			return "pass";
		}
		return "fail";
	}

}
