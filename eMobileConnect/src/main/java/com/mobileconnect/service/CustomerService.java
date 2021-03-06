package com.mobileconnect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileconnect.entity.Customer;
import com.mobileconnect.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public CustomerService() {
		// TODO Auto-generated constructor stub
	}
	
	public void saveCustomer(Customer customer) {
		customerRepository.save(customer);
	}

}
