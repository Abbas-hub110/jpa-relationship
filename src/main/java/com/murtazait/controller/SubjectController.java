package com.murtazait.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murtazait.entity.Student;
import com.murtazait.entity.Subject;
import com.murtazait.entity.Teacher;
import com.murtazait.repositiry.StudentRepository;
import com.murtazait.repositiry.SubjectRepository;
import com.murtazait.repositiry.TeacherRepository;

@RestController
@RequestMapping("/subject")
public class SubjectController {
	@Autowired
	SubjectRepository subRepo;
	@Autowired
	StudentRepository studRepo;
	@Autowired
	TeacherRepository techRepo;

	@GetMapping()
	public List<Subject> allSubject() {
		return subRepo.findAll();
	}

	@PostMapping()
	public Subject saveSubject(@RequestBody Subject subject) {
		return subRepo.save(subject);
	}

	@PutMapping("/{subjectId}/student/{studentId}")
	public Subject enrolledStudent(@PathVariable Long subjectId, @PathVariable Long studentId) {
		Subject subject = subRepo.findById(subjectId).get();
		Student student = studRepo.findById(studentId).get();
		subject.enrolledStudent(student);
		return subRepo.save(subject);
	}

	@PutMapping("/{subjectId}/teacher/{teacherId}")
	public Subject assignedTeacher(@PathVariable Long subjectId, @PathVariable Long teacherId) {
		Subject subject = subRepo.findById(teacherId).get();
		Teacher teacher = techRepo.findById(teacherId).get();
		subject.assignedTeacher(teacher);
		return subRepo.save(subject);
	}
}
