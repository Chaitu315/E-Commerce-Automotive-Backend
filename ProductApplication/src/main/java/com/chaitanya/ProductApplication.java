package com.chaitanya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//The @SpringBootApplication is the combination of three annotations @EnableAutoConfiguration, @ComponentScan, and @Configuration.
@SpringBootApplication
public class ProductApplication
{

	public static void main(String[] saurabh)
	{
		SpringApplication.run(ProductApplication.class, saurabh);
	}

}
