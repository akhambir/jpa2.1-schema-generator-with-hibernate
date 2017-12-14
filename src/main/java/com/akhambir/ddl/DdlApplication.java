package com.akhambir.ddl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@SpringBootApplication
public class DdlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DdlApplication.class, args);
	}

	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactory() {
		LocalEntityManagerFactoryBean em = new LocalEntityManagerFactoryBean();
		em.setPersistenceUnitName("primary");
		return em;
	}
}
