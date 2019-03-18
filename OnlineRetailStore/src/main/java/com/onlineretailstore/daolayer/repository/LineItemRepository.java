package com.onlineretailstore.daolayer.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.onlineretailstore.daolayer.component.LineItem;

public interface LineItemRepository extends CrudRepository<LineItem, Long> {
	
	public List<LineItem> findByProduct_id(long prodId);

}
