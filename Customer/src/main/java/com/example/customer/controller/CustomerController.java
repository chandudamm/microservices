package com.example.customer.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.domain.Customer;
import com.example.customer.repository.CustomerRepository;

@RestController
@RequestMapping("/")
public class CustomerController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@RequestMapping(path="/customers", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getCustomers(){
		return customerRepository.findAll();
	}
	
	@RequestMapping(path="/customers/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Customer findCustomer(@PathVariable("id") long customerId){
		return customerRepository.findOne(customerId);
	}

}
