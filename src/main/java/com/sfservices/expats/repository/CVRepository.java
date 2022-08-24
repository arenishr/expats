package com.sfservices.expats.repository;

import org.springframework.data.repository.CrudRepository;


public interface CVRepository extends CrudRepository<CV, Long> {

	
	CV findById(long id);
}


