package com.murtazait.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murtazait.entity.Student;
import com.murtazait.repositiry.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentRepository studRepo;
	
	@GetMapping()
	public List<Student> allStudent(){
		return studRepo.findAll();
	}
	@PostMapping()
	public Student saveStudent(@RequestBody Student student){
		return studRepo.save(student);
	}
	
}
