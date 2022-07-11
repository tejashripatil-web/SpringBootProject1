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

import com.technosignia.AutoGenuine.entity.Fault;
import com.technosignia.AutoGenuine.service.FaultService;

@RestController
public class FaultController {
	//inject all dependencies of another class into present class
	@Autowired
	FaultService faultService;
	
	@PostMapping("createfault/fault")
	public Fault creatFault(@RequestBody Fault fault)
	{
		return faultService.createFault(fault);
	}
	
	@GetMapping("/fault")
	public List<Fault> getAllFaults()
	{
		return faultService.getFaults();
	}
	
	@GetMapping("/fault/{id}")
	public Fault findFaultById(@PathVariable Long id)
	{
		return faultService.findFaultById(id);
	}
	
	@PutMapping("/fault")
	public Fault editFault(@RequestBody Fault fault, @RequestParam Long id) {
		return faultService.editFault(fault,id);
	}
	
	@DeleteMapping("/fault/{id}")
		public String deleteFault(@PathVariable Long id)
		{
			return faultService.deleteFault(id);
		}
	}

