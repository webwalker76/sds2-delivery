package com.dsdelivery.sistema.entregas.services;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dsdelivery.sistema.entregas.dto.OrderDto;
import com.dsdelivery.sistema.entregas.entities.Orders;
import com.dsdelivery.sistema.entregas.repositories.OrderRepository;


@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	@Transactional(readOnly = true)
	public List<OrderDto> findAll(){
		List<Orders> list = repository.findOrdersWhithProducts();
		return list.stream().map(x -> new OrderDto(x)).collect(Collectors.toList());
		
	}
}
