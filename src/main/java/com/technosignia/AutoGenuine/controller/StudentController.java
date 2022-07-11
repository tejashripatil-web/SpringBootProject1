package com.technosignia.AutoGenuine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.technosignia.AutoGenuine.entity.Student;
import com.technosignia.AutoGenuine.service.StudentService;

@RestController
public class StudentController
{
  @Autowired StudentService studentService;
	@PostMapping("/student")
	public Student createStudent(@RequestBody Student student)
	{
		return studentService.createStudent(student);
	}
	
	@GetMapping("/student")
	public List<Student> getAllStudent()
	{
		return studentService.getAllStudent();
	}
	
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable Long id)
	{
		return studentService.getStudentById(id);
	}
	
	@PutMapping("/student")
	public Student updateStudent(@RequestParam long id,@RequestBody Student student)
	{
		return studentService.updateStudent(id,student);
	}
	
	@DeleteMapping("/student/{id}")
	public void deleteStudentById(@PathVariable Long id)
	{
		 studentService.deleteStudentById(id);
	}
		
}
