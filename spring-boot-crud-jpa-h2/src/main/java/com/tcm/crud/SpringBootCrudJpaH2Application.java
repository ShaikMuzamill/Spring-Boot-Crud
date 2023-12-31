package com.tcm.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.tcm.crud.entity")
public class SpringBootCrudJpaH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudJpaH2Application.class, args);
	}

}
