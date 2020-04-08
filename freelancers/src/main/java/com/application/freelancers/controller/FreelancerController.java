package com.application.freelancers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.freelancers.model.Category;
import com.application.freelancers.model.Freelancer;
import com.application.freelancers.service.FreelancerService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FreelancerController {

	@Autowired
	private FreelancerService freelancerService;

	@RequestMapping("/api/freelancers")
	public List<Freelancer> getAllFreelancers() {
		return freelancerService.getAllFreelancers();
	}

	@RequestMapping("/api/freelancers/category/{category}")
	public List<Freelancer> getFreelancersByCategory(@PathVariable("category") int category) {
		return freelancerService.getFreelancersByCategory(category);
	}

	@RequestMapping("/api/freelancers/categories")
	public List<Category> getAllCategories() {
		return freelancerService.getCategories();
	}
	
	@RequestMapping("/api/freelancers/{name}")
	public List<Freelancer> getFreelancersByName(@PathVariable("name") String name){
		return freelancerService.getFreelancersByName(name);
	}

}
