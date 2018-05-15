package com.touresbalon.service.accounting.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.touresbalon.service.accounting.entities.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long>{

}
