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

import com.technosignia.AutoGenuine.entity.Jobcard;
import com.technosignia.AutoGenuine.service.JobcardService;

@RestController
public class JobcardController {
	
	@Autowired
	JobcardService jobcardService;
	
	@PostMapping("api/jobcard")
	public Jobcard createJobcard(@RequestBody Jobcard jobcard)
	{
		return jobcardService.createJobcard(jobcard);
	}
	
	@GetMapping("api/jobcard")
	public List<Jobcard> getJobcards()
	{
		return jobcardService.getJobcards();
	}
	
	@GetMapping("api/jobcard/{id}")
	public Jobcard findJobcardById(@PathVariable Long id)
	{
		return jobcardService.findJobcardById(id);
	}
	
	@PutMapping("api/jobcard")
	public Jobcard editJobcard(@RequestBody Jobcard jobcard,@RequestParam Long id)
	{
		return jobcardService.editJobcard(jobcard,id);	
	}
	
	@DeleteMapping("api/jobcard/{id}")
	public String deleteJobcard(@PathVariable Long id)
	{
		return jobcardService.deleteJobcard(id);
	}
}
