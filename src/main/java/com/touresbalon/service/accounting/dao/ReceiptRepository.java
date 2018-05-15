package com.touresbalon.service.accounting.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.touresbalon.service.accounting.entities.Receipt;

public interface ReceiptRepository extends JpaRepository<Receipt, Long>{

}
