package com.erp.assesment.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ErpServiceTest {
	
	@Autowired 
	ErpService service;
	
	@Test
	public void testFindPrimeNumbers() {
		
		List<Integer> expected = new ArrayList<>();
		
		int[] exp = new int[]{2,3,5,7,11,13,17,19};
		
		List actual = Arrays.asList(exp);
		
		expected = service.findPrimeNumbers(20);
		
		assertNotNull(expected);
		
		Assert.assertEquals(actual, expected);
	}

}
