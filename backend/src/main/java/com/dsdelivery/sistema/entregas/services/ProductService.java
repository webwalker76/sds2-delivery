package com.dsdelivery.sistema.entregas.services;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dsdelivery.sistema.entregas.dto.ProductDTO;
import com.dsdelivery.sistema.entregas.entities.Product;
import com.dsdelivery.sistema.entregas.repositories.ProductsRepository;


@Service
public class ProductService {
	
	@Autowired
	private ProductsRepository repository;
	@Transactional(readOnly = true)
	public List<ProductDTO> findAll(){
		List<Product> list = repository.findAllByOrderByNameAsc();
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
		
	}
}
