package com.example.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.domain.Customer;
import com.example.customer.repository.CustomerRepository;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@GetMapping
	public List<Customer> getCustomers(){
		return customerRepository.findAll();
	}
	
	/*@GetMapping(path="/{id}")
	public Customer findCustomer(@PathVariable("id") long customerId){
		return customerRepository.findOne(customerId);
	}*/
	
	@GetMapping(path="/{name}")
	public Customer findByName(@PathVariable("name") String name ){
		return customerRepository.findByName(name);
	}
	
	@PostMapping
	public Customer createCustomer(@RequestBody Customer customer){
		customerRepository.save(customer);
		return customerRepository.findByName(customer.getName());
	}

}
