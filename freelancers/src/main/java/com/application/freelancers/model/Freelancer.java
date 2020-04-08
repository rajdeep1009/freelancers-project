package com.application.freelancers.model;

public class Freelancer {
	
	private String name;
	private int category;
	private String description;
	private String charge;
	private String email;
	private String phone;
	private String imageUrl;
	
	public Freelancer() {
		// TODO Auto-generated constructor stub
	}

	

	public Freelancer(String name, int category, String description
			, String charge, String email, String phone, String imageUrl) {
		super();
		this.name = name;
		this.category = category;
		this.description = description;
		this.charge = charge;
		this.email = email;
		this.phone = phone;
		this.imageUrl = imageUrl;
	}


	
	public String getImageUrl() {
		return imageUrl;
	}



	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCharge() {
		return charge;
	}
	public void setCharge(String charge) {
		this.charge = charge;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	
	

}
