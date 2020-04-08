package com.application.freelancers.util;

import java.util.ArrayList;
import java.util.List;

import com.application.freelancers.model.Category;
import com.application.freelancers.model.Freelancer;

public class DataSource {
	
	private static List<Freelancer> freelancers;
	private static List<Category> categories;
	
	static {
		freelancers = new ArrayList<Freelancer>();
		freelancers.add(new Freelancer("John",1,"Java Developer","3500","abc@ghi.com","9999","/assets/placeholder1.jpg"));
		freelancers.add(new Freelancer("Rohan",1,"React JS","455","abc@ghi.com","9999","/assets/placeholder1.jpg"));
		freelancers.add(new Freelancer("Sima",1,"Android","600","abc@ghi.com","9999","/assets/placeholder2.jpg"));
		freelancers.add(new Freelancer("Mike",1,"Web developer","3000","abc@ghi.com","9999","/assets/placeholder1.jpg"));
		freelancers.add(new Freelancer("Tarun",2,"Interior Designer","40000","abc@ghi.com","9999","/assets/placeholder1.jpg"));
		freelancers.add(new Freelancer("Abraham",4,"Chef","5000","abc@ghi.com","9999","/assets/placeholder1.jpg"));
		freelancers.add(new Freelancer("Gita",4,"Party orders & Catering","9000","abc@ghi.com","9999","/assets/placeholder2.jpg"));
		freelancers.add(new Freelancer("Johny",3,"Singing lessons","400","abc@ghi.com","9999","/assets/placeholder1.jpg"));
		freelancers.add(new Freelancer("Simson",3,"English teacher","500","abc@ghi.com","9999","/assets/placeholder1.jpg"));
		freelancers.add(new Freelancer("Gallert",3,"Maths teacher","700","abc@ghi.com","9999","/assets/placeholder1.jpg"));
		freelancers.add(new Freelancer("Ronald",3,"Dance teacher","400","abc@ghi.com","9999","/assets/placeholder1.jpg"));
		freelancers.add(new Freelancer("Mona",4,"Fine artist","35000","abc@ghi.com","9999","/assets/placeholder2.jpg"));
		freelancers.add(new Freelancer("Sima",4,"Driving agency","3500","abc@ghi.com","9999","/assets/placeholder2.jpg"));
		freelancers.add(new Freelancer("Lockhart",3,"Books supplier","500","abc@ghi.com","9999","/assets/placeholder1.jpg"));
		freelancers.add(new Freelancer("Donald",1,"Computer repairs","600","abc@ghi.com","9999","/assets/placeholder1.jpg"));
		
		
		categories = new ArrayList<Category>();
		categories.add(new Category(1, "Technical"));
		categories.add(new Category(2, "Home & Interior Design"));
		categories.add(new Category(3, "Education"));
		categories.add(new Category(4, "Art & Cooking"));
		
		
	}

	public static List<Freelancer> getFreelancers() {
		return freelancers;
	}

	public static void setFreelancers(List<Freelancer> freelancers) {
		DataSource.freelancers = freelancers;
	}

	public static List<Category> getCategories() {
		return categories;
	}

	public static void setCategories(List<Category> categories) {
		DataSource.categories = categories;
	}
	
}
