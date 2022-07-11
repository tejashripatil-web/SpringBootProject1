package com.technosignia.AutoGenuine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.technosignia.AutoGenuine.entity.Jobcard;
import com.technosignia.AutoGenuine.repository.FaultRepository;
import com.technosignia.AutoGenuine.repository.JobcardRepository;

@Service
public class JobcardService 
{
   @Autowired
   JobcardRepository jobcardRepository;
   
	public Jobcard createJobcard(Jobcard jobcard)
	{
		return jobcardRepository.save(jobcard);
	}

	public Jobcard findJobcardById(Long id)
	{
	   Optional<Jobcard> opJobcard=null;
	   opJobcard=jobcardRepository.findById(id);
	   return opJobcard.get();
	}

	public Jobcard editJobcard(Jobcard jobcard, Long id) 
	{  
		Optional<Jobcard> opJobcard=null;
		opJobcard=jobcardRepository.findById(id);
		Jobcard dbJobcard=opJobcard.get();
		dbJobcard.setJcNumber(jobcard.getJcNumber());
		dbJobcard.setCustomerName(jobcard.getCustomerName());
		dbJobcard.setV_no(jobcard.getV_no());
		
		return jobcardRepository.save(dbJobcard);
	}

	public String deleteJobcard(Long id) 
	{
		jobcardRepository.deleteById(id);
		return "Deleted SuccessFully";
	}
	public List<Jobcard> getJobcards() 
	{
		
		return jobcardRepository.findAll();
	}

}
