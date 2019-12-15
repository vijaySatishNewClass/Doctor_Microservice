package com.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com")
@EnableAutoConfiguration(exclude = HibernateJpaAutoConfiguration.class)
public class DoctorManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorManagementApplication.class, args);
	}

}
