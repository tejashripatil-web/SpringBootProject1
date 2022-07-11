package com.technosignia.AutoGenuine.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Jobcard {
	
	@Id
	private long id;
	private String jcNumber;
	private String customerName;
	private String v_no;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getJcNumber() {
		return jcNumber;
	}
	public void setJcNumber(String jcNumber) {
		this.jcNumber = jcNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getV_no() {
		return v_no;
	}
	public void setV_no(String v_no) {
		this.v_no = v_no;
	}
}
