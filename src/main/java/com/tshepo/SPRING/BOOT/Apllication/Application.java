package com.tshepo.SPRING.BOOT.Apllication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication()
@EnableCaching
@ComponentScan
public class Application {
	public static void main(String[] args) throws NullPointerException {
		SpringApplication.run(Application.class, args);
	}
}


