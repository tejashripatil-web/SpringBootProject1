package com.technosignia.AutoGenuine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technosignia.AutoGenuine.dto.AddressDto;
import com.technosignia.AutoGenuine.dto.EmployeeDto;
import com.technosignia.AutoGenuine.entity.Address;
import com.technosignia.AutoGenuine.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{	

}
