package com.touresbalon.service.accounting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional("transactionManagerJPA")
public abstract class AccountingService<T> {

	@Autowired
	private JpaRepository<T, Long> repository;
	
	
	public T saveObject(T object) {
		return repository.save(object);
	}
}
