package com.application.freelancers.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.application.freelancers.model.Category;
import com.application.freelancers.model.Freelancer;
import com.application.freelancers.util.DataSource;

@Service
public class FreelancerService {
	
	public List<Freelancer> getAllFreelancers(){
		return DataSource.getFreelancers();
	}
	
	public List<Freelancer> getFreelancersByCategory(int category){
		return DataSource.getFreelancers().stream()
				.filter(freelancer -> category == (freelancer.getCategory()))
				.collect(Collectors.toList());
	}
	
	public List<Freelancer> getFreelancersByName(String name){
		return DataSource.getFreelancers().stream()
				.filter(freelancer -> name.equalsIgnoreCase(freelancer.getName()))
				.collect(Collectors.toList());
	}
	
	public List<Category> getCategories(){
		return DataSource.getCategories();
	}

}
