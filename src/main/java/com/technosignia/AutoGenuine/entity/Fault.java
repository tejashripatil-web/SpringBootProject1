package com.technosignia.AutoGenuine.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fault
{
	
	//create datamembers
	@Id
	private long id;
	private String fNo;
	private String description;
	
	//geter setter methods
	public long getId() 
	{
		return id;
	}
	public void setId(long id) 
	{
		this.id = id;
	}
	public String getfNo() {
		return fNo;
	}
	public void setfNo(String fNo) {
		this.fNo = fNo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
