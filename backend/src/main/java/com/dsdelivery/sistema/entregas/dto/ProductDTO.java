package com.dsdelivery.sistema.entregas.dto;

import java.io.Serializable;

import com.dsdelivery.sistema.entregas.entities.Product;

public class ProductDTO implements Serializable{
	
	private static final long serialVersionUID=1L;

	private long id;
	private String name;
	private double price;
	private String description;
    private String image_uri;
    
    public ProductDTO() {
    	
    }

	public ProductDTO(long id, String name, double price, String description, String image_uri) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.image_uri = image_uri;
	}
    
	public ProductDTO(Product entity) {
		id = entity.getId();
		name = entity.getName();
	    price = entity.getPrice();
		description = entity.getDescription();
		image_uri = entity.getImage_uri();
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage_uri() {
		return image_uri;
	}

	public void setImage_uri(String image_uri) {
		this.image_uri = image_uri;
	}
    
	
}
