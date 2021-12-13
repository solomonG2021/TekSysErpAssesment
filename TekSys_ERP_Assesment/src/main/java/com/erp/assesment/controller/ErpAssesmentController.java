package com.erp.assesment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.assesment.service.ErpService;

/*
 * Author - Solomon Gugsa
 * ERP Assesment
 * */
@RestController
@RequestMapping("/getprime")
public class ErpAssesmentController {

	@Autowired
	ErpService service;
	
	@GetMapping("/{id}")
    public List<Integer> getClient(@PathVariable int id){
        return service.findPrimeNumbers(id);
    }
}
