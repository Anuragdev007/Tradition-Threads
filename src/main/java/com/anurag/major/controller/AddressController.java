package com.anurag.major.controller;

import com.anurag.major.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.anurag.major.repository.AddressRepositry;
import com.anurag.major.repository.ProductRepository;

@Controller
public class AddressController {
	@Autowired
	AddressRepositry addressRepositry;
	@Autowired
	ProductRepository productRepository;
	

	@PostMapping("/payNow")
	public String register( @ModelAttribute Address address) {
	
		
		addressRepositry.save(address);
		return "payNow";
		
	}

}
