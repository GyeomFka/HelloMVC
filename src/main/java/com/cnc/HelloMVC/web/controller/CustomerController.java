package com.cnc.HelloMVC.web.controller;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnc.HelloMVC.domain.service.CustomerService;
import com.cnc.HelloMVC.web.dto.CustomerDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class CustomerController {

	private final CustomerService customerService;

	@PostMapping("/customer")
	public CustomerDto createCustomer(CustomerDto dto) {
		return customerService.createCustomer(dto);
	}
}
