package com.touresbalon.service.accountingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages= {"com.touresbalon"})
public class AccountingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountingServiceApplication.class, args);
	}
}
