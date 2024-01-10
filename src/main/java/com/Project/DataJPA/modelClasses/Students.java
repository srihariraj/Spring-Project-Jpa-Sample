package com.Project.DataJPA.modelClasses;

import jakarta.persistence.*;

import lombok.*;

@Data
@Entity
@Table(name="STUDENTS")
public class Students {

	public Students(long serial, String name, String dept, float mark) {
		super();
		this.serial = serial;
		this.name = name;
		this.dept = dept;
		this.mark = mark;
	}

	public long getSerial() {
		return serial;
	}

	public void setSerial(long serial) {
		this.serial = serial;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public float getMark() {
		return mark;
	}

	public void setMark(float mark) {
		this.mark = mark;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ROLL")
	private long serial;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="DEPT")
	private String dept;
	
	@Column(name="MARK")
	private float mark;
	
	public Students() {
		// TODO Auto-generated constructor stub
	}

}
