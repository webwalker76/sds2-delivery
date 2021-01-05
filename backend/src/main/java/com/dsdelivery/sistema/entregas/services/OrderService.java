package com.dsdelivery.sistema.entregas.services;


import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dsdelivery.sistema.entregas.dto.OrderDto;
import com.dsdelivery.sistema.entregas.dto.ProductDTO;
import com.dsdelivery.sistema.entregas.entities.OrderStatus;
import com.dsdelivery.sistema.entregas.entities.Orders;
import com.dsdelivery.sistema.entregas.entities.Product;
import com.dsdelivery.sistema.entregas.repositories.OrderRepository;
import com.dsdelivery.sistema.entregas.repositories.ProductsRepository;


@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	@Autowired
	private ProductsRepository productRepository;
	
	@Transactional(readOnly = true)
	public List<OrderDto> findAll(){
		List<Orders> list = repository.findOrdersWhithProducts();
		return list.stream().map(x -> new OrderDto(x)).collect(Collectors.toList());
	}
	
	@Transactional
	public OrderDto insert(OrderDto dto){
		Orders order = new Orders(null, dto.getLongitude(),dto.getLongitude(),Instant.now(),OrderStatus.PENDING, dto.getAddress())	;
		for (ProductDTO p: dto.getProducts()) {
			Product product = productRepository.getOne(p.getId());
			order.getProducts().add(product);
		}
		repository.save(order);
		return new OrderDto(order);
	}
}
