package com.onlineretailstore.daolayer.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.onlineretailstore.daolayer.component.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

	public long count();

	public List<Product> findByBarCodeId(String barCodeId);

}
