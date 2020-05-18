package com.tshepo.SPRING.BOOT.Apllication;

import com.tshepo.SPRING.BOOT.Apllication.Dao.FakeRepo;
import com.tshepo.SPRING.BOOT.Apllication.Security.SecurityConfig;
import com.tshepo.SPRING.BOOT.Apllication.service.UserServiceImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import java.util.Collections;

@SpringBootApplication
@EnableCaching
class Application {
	public static void main(String[] args) throws NullPointerException, NoSuchMethodException {
			SpringApplication application = new SpringApplication(Application.class);
			application.setDefaultProperties(Collections.singletonMap("server.port", "9090"));
			application.run(args);
			FakeRepo fakeRepo = new FakeRepo();
			System.out.println(FakeRepo.insertUser(1,"theo","park"));
			System.out.println(fakeRepo.findUserById(1));
			System.out.println(fakeRepo.deleteUser(1));
			UserServiceImplementation userServiceImplementation = new UserServiceImplementation();
		    System.out.println(userServiceImplementation.getUser(1));
		    System.out.println(new WebSecurityConfig().toString());
	}


}


