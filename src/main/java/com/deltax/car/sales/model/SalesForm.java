package com.deltax.car.sales.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SalesForm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String phone;
	private String city;
	private String model;
	private String company;
	private String status;
	
	public SalesForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalesForm(int id, String name, String phone, String city, String model, String company, String status) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.city = city;
		this.model = model;
		this.company = company;
		this.status = status;
	}
	
	public SalesForm(String name, String phone, String city, String model, String company, String status) {
		super();
		this.name = name;
		this.phone = phone;
		this.city = city;
		this.model = model;
		this.company = company;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "SalesForm [id=" + id + ", name=" + name + ", phone=" + phone + ", city=" + city + ", model=" + model
				+ ", company=" + company + ", status=" + status + "]";
	}
	
	
	

}
