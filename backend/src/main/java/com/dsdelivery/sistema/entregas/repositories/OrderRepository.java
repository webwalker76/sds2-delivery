package com.dsdelivery.sistema.entregas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dsdelivery.sistema.entregas.entities.Orders;

    public interface OrderRepository extends JpaRepository<Orders, Long>{
        @Query("SELECT DISTINCT obj FROM Orders obj JOIN FETCH obj.products "+
               "WHERE obj.status = 0 ORDER BY obj.moment ASC")
    	List<Orders> findOrdersWhithProducts();	
}
