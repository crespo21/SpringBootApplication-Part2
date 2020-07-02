package com.tshepo.SPRING.BOOT.Application;

import com.tshepo.SPRING.BOOT.Apllication.Dao.FakeRepository;
import com.tshepo.SPRING.BOOT.Apllication.WebSecurityConfigurer;
import com.tshepo.SPRING.BOOT.Apllication.service.UserService;
import com.tshepo.SPRING.BOOT.Apllication.service.UserServiceImplementation;
import org.junit.jupiter.api.Test;
import org.springframework.cache.annotation.EnableCaching;

import static org.assertj.core.api.Assertions.assertThat;
@EnableCaching
public class ApplicationTests {
    @Test
    public void testInsertUser() {
         assertThat(Boolean.parseBoolean(new UserServiceImplementation(new FakeRepository()).
                 addUser(1,"theo","park")));
    }
    @Test
    public void testFindUserById(){
        assertThat(Boolean.parseBoolean(new FakeRepository().findUserById(1)));
    }
    @Test
    public void deleteUserTest(){
        assertThat(Boolean.parseBoolean(new FakeRepository().deleteUser(1)+" is removed"));
    }

    @Test
    public void getUserTestFromUserServiceImpl() throws NullPointerException {
        assertThat(Boolean.parseBoolean(String.valueOf(new UserServiceImplementation(new FakeRepository())
                .addUser(1,"crespo","venus"))));
        assertThat(Boolean.parseBoolean(String.valueOf(new UserServiceImplementation(new FakeRepository())
                .getUser(1))));
        assertThat(Boolean.parseBoolean(String.valueOf(new UserServiceImplementation(new FakeRepository())
                .removeUser(1))));
    }
    @Test
    public void testSecurityConfig() {
        assertThat(Boolean.parseBoolean(String.valueOf(new WebSecurityConfigurer())));
    }

}


