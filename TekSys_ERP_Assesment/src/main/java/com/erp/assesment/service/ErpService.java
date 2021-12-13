package com.erp.assesment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

/*
 * Author - Solomon Gugsa
 * This Class will serve for API request call and give a list of integer as a response
  *This Service class will use to find prime numbers by The Sieve of Eratosthenes method*/

@Service
public class ErpService {

	public List<Integer> findPrimeNumbers(int n){
		
		List<Integer> list = new ArrayList<>();

		boolean [] b = new boolean[n];
		
		for(int i=2;i<b.length;i++){
			b[i]=true;
		}
		
		for (int i = 2; i< Math.sqrt(n); i++) {  
	         if(b[i] == true) {  
	            for(int j = (i*i); j<n; j = j+i) {  
	               b[j] = false;  
	            }  
	         }  
	      }  
		for(int k=0;k<b.length;k++){
			if(b[k]==true)
			list.add(k);
		}
		return list;
	}

}
