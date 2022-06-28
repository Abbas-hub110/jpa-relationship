package com.murtazait.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murtazait.entity.Teacher;
import com.murtazait.repositiry.TeacherRepository;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	@Autowired
	TeacherRepository tRepo;

	@GetMapping()
	public List<Teacher> allTeacher() {
		return tRepo.findAll();
	}

	@PostMapping()
	public Teacher saveTeacher(@RequestBody Teacher teacher) {
		return tRepo.save(teacher);
	}
}
