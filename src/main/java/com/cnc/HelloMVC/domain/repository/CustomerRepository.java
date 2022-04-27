package com.cnc.HelloMVC.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cnc.HelloMVC.domain.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
