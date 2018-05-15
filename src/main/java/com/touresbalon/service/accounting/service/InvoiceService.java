package com.touresbalon.service.accounting.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.touresbalon.service.accounting.entities.Invoice;

@Service
@Transactional("transactionManagerJPA")
public class InvoiceService extends AccountingService<Invoice>{

}
