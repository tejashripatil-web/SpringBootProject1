package com.technosignia.AutoGenuine.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.technosignia.AutoGenuine.dto.EmployeeDto;
import com.technosignia.AutoGenuine.entity.Employee;
import com.technosignia.AutoGenuine.service.EmployeeService;

@RestController
public class EmployeeController 
{
  @Autowired EmployeeService empService;
  @Autowired ModelMapper mapper;
  @PostMapping("/employee")
  public Employee createEmployee(@RequestBody EmployeeDto empDto)
  {
	  
      return empService.createEmployee(empDto);
  }
  
  @GetMapping("/employee")
  public List<Employee> getAllEmployee()
  {
	 List<Employee> list= empService.getAllEmployee();
	 return list;
  }
  
  @GetMapping("/employee/{id}")
	public EmployeeDto getEmployeeById(@PathVariable Long id)
	{
		return empService.getEmployeeById(id);
	}
  
  @PutMapping("/employee/{id}")
  public Employee updateEmployee(@RequestBody EmployeeDto dto,@PathVariable Long id)
  {
	  return empService.updateEmployee(dto,id);
  }
  
  @DeleteMapping("/employee/{id}")
  public void deleteEmployee(@PathVariable Long id)
  {
	  empService.deleteEmployee(id);
  }
}
