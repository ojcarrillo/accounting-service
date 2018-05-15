package com.touresbalon.service.accounting.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.touresbalon.service.accounting.entities.Bill;

@Service
@Transactional("transactionManagerJPA")
public class BillService extends AccountingService<Bill>{

}
