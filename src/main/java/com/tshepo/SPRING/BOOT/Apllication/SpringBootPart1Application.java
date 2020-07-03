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
			application.setDefaultProperties(Collections.singletonMap("server.port", "8887"));
			application.run(args);
			FakeRepository fakeRepository = new FakeRepository();
			System.out.println(FakeRepository.insertUser(1,"theo","park"));
			System.out.println(fakeRepository.findUserById(1));
			System.out.println(fakeRepository.deleteUser(1));
			UserServiceImplementation userServiceImplementation = new UserServiceImplementation(fakeRepository);
		    System.out.println(userServiceImplementation.getUser(1));
		    System.out.println(userServiceImplementation.getUser(1));
		    System.out.println(userServiceImplementation.getUser(1));
		    System.out.println(new WebSecurityConfigurer());
	}
}


