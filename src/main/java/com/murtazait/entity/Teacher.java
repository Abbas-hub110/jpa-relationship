package com.murtazait.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity 
//@Data
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	private String name;
	
	@JsonIgnore
	@OneToMany(mappedBy = "teacher")
	private Set<Subject> assignedSubjects;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Subject> getAssignedSubjects() {
		return assignedSubjects;
	}

	public void setAssignedSubjects(Set<Subject> assignedSubjects) {
		this.assignedSubjects = assignedSubjects;
	}
	
	
}
