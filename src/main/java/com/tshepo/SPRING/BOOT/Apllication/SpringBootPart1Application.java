package com.tshepo.SPRING.BOOT.Apllication;

import com.tshepo.SPRING.BOOT.Apllication.Dao.FakeRepository;
import com.tshepo.SPRING.BOOT.Apllication.service.UserServiceImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import java.util.Collections;

@SpringBootApplication
@EnableCaching
class Application {
	public static void main(String[] args) throws NullPointerException {
			SpringApplication application = new SpringApplication(Application.class);
			application.setDefaultProperties(Collections.singletonMap("server.port", "9090"));
			application.run(args);
			FakeRepository fakeRepository = new FakeRepository();
		    System.out.println("****User contents From User Service Implementation****");
		    UserServiceImplementation userServiceImplementation = new  UserServiceImplementation(fakeRepository);
		    System.out.println(userServiceImplementation.addUser(1, "Lesley","jones"));
		    System.out.println(userServiceImplementation.getUser(1));
		    System.out.println(userServiceImplementation.removeUser(1));
		    System.out.println(new WebSecurityConfigurer());
	}
}


