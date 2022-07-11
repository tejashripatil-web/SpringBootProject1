package com.technosignia.AutoGenuine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technosignia.AutoGenuine.entity.Fault;
import com.technosignia.AutoGenuine.repository.FaultRepository;

@Service
public class FaultService {
	
	@Autowired
	FaultRepository faultRepository;
	
	public Fault createFault(Fault fault)
	{
		return faultRepository.save(fault);
	}
	
	public List<Fault> getFaults()
	{
		return faultRepository.findAll();
	}
	
	public Fault findFaultById(Long id)
	{
		Optional<Fault> opFault = null;
		 opFault = faultRepository.findById(id);
		 
		return opFault.get();
	}
	
	public Fault editFault(Fault fault, Long id) {
		Optional<Fault> opFault = null;
		 opFault = faultRepository.findById(id);
		 Fault dbFault =opFault.get();
		 dbFault.setDescription(fault.getDescription());
		 dbFault.setfNo(fault.getfNo());
		 
		return faultRepository.save(dbFault);
	}

	public String deleteFault(Long id)
	{
		faultRepository.deleteById(id);	
		return "deleted successfully";
	}
}
