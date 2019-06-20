package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.repo.ProductRepository;

@Component
public class ProductRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("--------1.Output---------------------------------------");
		
		int count1 =repo.updateCost(18.18, 4);
		System.out.println(count1);

		System.out.println("--------2.Output---------------------------------------");
		
		int count2 =repo.removeData(2);
		System.out.println(count2);
	}

}
