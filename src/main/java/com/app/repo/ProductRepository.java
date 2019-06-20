package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Modifying
	@Transactional
	@Query("update Product p set p.prodCost=:cost where p.prodId=:id")
	public int updateCost(Double cost,Integer id);
	
	@Modifying
	@Transactional
	@Query("delete from Product p where p.prodId=:id")
	public int removeData(Integer id);
}
