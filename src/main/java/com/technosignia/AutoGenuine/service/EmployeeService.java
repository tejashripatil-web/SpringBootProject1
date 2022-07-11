package com.technosignia.AutoGenuine.service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technosignia.AutoGenuine.dto.AddressDto;
import com.technosignia.AutoGenuine.dto.EmployeeDto;
import com.technosignia.AutoGenuine.entity.Address;
import com.technosignia.AutoGenuine.entity.Employee;
import com.technosignia.AutoGenuine.repository.AddressRepository;
import com.technosignia.AutoGenuine.repository.EmployeeRepository;

@Service
public class EmployeeService
{
    @Autowired EmployeeRepository empRepository;
    @Autowired AddressRepository addressRepository;
    @Autowired ModelMapper mapper;
   
	public Employee createEmployee(EmployeeDto empDto) 
	{
		Employee e=new Employee();
		 //dto to entity
		 Employee empReq=mapper.map(empDto, Employee.class);
		 empRepository.save(empReq);
		
		Set<AddressDto> addDto =  empDto.getAddress();
		//entity to dto
		Set<Address> entityToDto = mapper.map(addDto, new TypeToken<Set<Address>>(){}.getType());
		for (Address address : entityToDto) {
			address.setEmployee(empReq);
			addressRepository.save(address);
		}
//		addressRepository.saveAll(entityToDto);
		
		return empRepository.save(empReq);
		 
	}
	public List<Employee> getAllEmployee() 
	{
		
		return empRepository.findAll();
	}

	public EmployeeDto getEmployeeById(Long id) 
	{
		Optional<Employee> emp =  empRepository.findById(id);
		EmployeeDto dto=mapper.map(emp,EmployeeDto.class);
		return dto;			
	}
	
	public Employee updateEmployee(EmployeeDto dto, Long id)
	{
       Optional<Employee> opReq=empRepository.findById(id);
		Employee emp = opReq.get();
		// dto to entity
	    Employee empReq=mapper.map(dto, Employee.class);
	    //entity to dto
	    //EmployeeDto empResponse=mapper.map(emp,EmployeeDto.class);
	    empRepository.save(empReq);
	    
	    AddressDto addDto=new AddressDto();
	    Optional<Address> add = addressRepository.findById(id);
		 Address address=add.get();
		 //dto to entity
		 Address addReq=mapper.map(addDto,Address.class);
		    //entity to dto
	    // AddressDto addResponse=mapper.map(add,AddressDto.class);
		 addReq.setEmployee(empReq);
		 addressRepository.save(addReq);
		 
		return empRepository.save(empReq);
	}
	
	
	public void deleteEmployee(Long id)
	{
		List<Address> optAddress = addressRepository.findByEmployeeId(id);
		if(!optAddress.isEmpty()) {
			addressRepository.deleteAll(optAddress);
		}
		Optional<Employee> e= empRepository.findById(id);
		empRepository.deleteById(id);
	}

}
