package com.technosignia.AutoGenuine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technosignia.AutoGenuine.entity.Student;
import com.technosignia.AutoGenuine.repository.StudentRepository;
@Service
public class StudentService 
{
   @Autowired StudentRepository studentRepository;
	public Student createStudent(Student student)
	{
		return studentRepository.save(student);
	}
	public List<Student> getAllStudent() 
	{ 
		return studentRepository.findAll();
	}
	public Student getStudentById(Long id) 
	{
		Optional<Student> opcard=null;
		opcard=studentRepository.findById(id);
		return opcard.get();
	}
	public Student updateStudent(long id, Student student) 
	{
		return studentRepository.save(student);
	}
	public void deleteStudentById(Long id)
	{
		studentRepository.deleteById(id);
		
	}

}
