package com.technosignia.AutoGenuine.dto;

import java.util.HashSet;
import java.util.Set;

import com.technosignia.AutoGenuine.entity.Address;

public class EmployeeDto 
{
	private long id;
	
	private String first_name;

	private String last_name;
	
    Set<AddressDto> address=new HashSet<>();
	
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	

	public Set<AddressDto> getAddress() {
		return address;
	}

	public void setAddress(Set<AddressDto> address) {
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	

}
