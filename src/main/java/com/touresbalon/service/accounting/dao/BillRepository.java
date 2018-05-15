package com.touresbalon.service.accounting.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.touresbalon.service.accounting.entities.Bill;

public interface BillRepository extends JpaRepository<Bill, Long>{

}
