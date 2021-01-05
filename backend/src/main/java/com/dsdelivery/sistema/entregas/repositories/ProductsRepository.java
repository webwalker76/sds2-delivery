package com.dsdelivery.sistema.entregas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsdelivery.sistema.entregas.entities.Product;

public interface ProductsRepository extends JpaRepository<Product, Long>{
  
	List<Product>findAllByOrderByNameAsc();
}
