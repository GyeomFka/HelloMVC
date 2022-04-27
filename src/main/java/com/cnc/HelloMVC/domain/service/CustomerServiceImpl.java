package com.cnc.HelloMVC.domain.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cnc.HelloMVC.domain.entity.Customer;
import com.cnc.HelloMVC.domain.repository.CustomerRepository;
import com.cnc.HelloMVC.web.dto.CustomerDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {

	private final CustomerRepository customerRepository;

	@Override
	public CustomerDto createCustomer(CustomerDto dto) {
		Customer customer = Customer.builder()
			.name(dto.getName())
			.address(dto.getAddress())
			.build();

		BeanUtils.copyProperties(dto, customer);

		customerRepository.save(customer);

		BeanUtils.copyProperties(customer, dto);

		return dto;
	}
}
