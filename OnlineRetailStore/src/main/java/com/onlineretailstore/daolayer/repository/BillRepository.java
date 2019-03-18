package com.onlineretailstore.daolayer.repository;

import org.springframework.data.repository.CrudRepository;

import com.onlineretailstore.daolayer.component.Bill;

public interface BillRepository extends CrudRepository<Bill, Long> {

}
