package com.touresbalon.service.accounting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.touresbalon.common.CommonResponse;
import com.touresbalon.common.ResponseFactory;
import com.touresbalon.service.accounting.entities.Bill;
import com.touresbalon.service.accounting.entities.Invoice;
import com.touresbalon.service.accounting.entities.Receipt;
import com.touresbalon.service.accounting.service.AccountingService;

@RestController
@RequestMapping("accounting")
public class AccountingController {
	
	@Autowired
	private AccountingService<Bill> billService;
	@Autowired
	private AccountingService<Invoice> invoiceService;
	@Autowired
	private AccountingService<Receipt> receiptService;
	
	@CrossOrigin
	@RequestMapping(value="bill/", method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<CommonResponse> createBill(@RequestBody Bill request) {
		Bill bill=billService.saveObject(request);
		return ResponseFactory.buildResponse(bill);
	}
	
	@CrossOrigin
	@RequestMapping(value="invoice/", method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<CommonResponse> createInvoice(@RequestBody Invoice request) {
		Invoice invoice=invoiceService.saveObject(request);
		return ResponseFactory.buildResponse(invoice);
	}
	
	@CrossOrigin
	@RequestMapping(value="receipt/", method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<CommonResponse> createReceipt(@RequestBody Receipt request) {
		Receipt receipt=receiptService.saveObject(request);
		return ResponseFactory.buildResponse(receipt);
	}
}
