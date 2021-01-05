package com.dsdelivery.sistema.entregas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsdelivery.sistema.entregas.entities.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long>{
  
	
	
}
