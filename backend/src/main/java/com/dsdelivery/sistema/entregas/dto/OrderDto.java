package com.dsdelivery.sistema.entregas.dto;
 
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.dsdelivery.sistema.entregas.entities.OrderStatus;
import com.dsdelivery.sistema.entregas.entities.Orders;

public class OrderDto implements Serializable{
	
	private static final long serialVersionUID=1L;

	private Long id;
    private Double latitude;
    private Double longitude;
    private Instant moment;
    private OrderStatus status;
    private String address;
    private List<ProductDTO> products = new ArrayList<>();
    
    public OrderDto() {
    	
    }

    
    
	public OrderDto(Long id, Double latitude, Double longitude, Instant moment, OrderStatus status, String address) {
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.moment = moment;
		this.status = status;
		this.address = address;
	}



	public OrderDto(Orders entity) {
		id = entity.getId();
		latitude = entity.getLatitude();
		longitude = entity.getLongitude();
		moment = entity.getMoment();
		status = entity.getStatus();
		address = entity.getAddress();
		products = entity.getProducts().stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public List<ProductDTO> getProducts() {
		return products;
	}
        	
}
