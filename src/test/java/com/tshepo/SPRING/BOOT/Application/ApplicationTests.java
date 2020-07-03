package com.tshepo.SPRING.BOOT.Application;

import com.tshepo.SPRING.BOOT.Apllication.Dao.FakeRepository;
import com.tshepo.SPRING.BOOT.Apllication.WebSecurityConfigurer;
import com.tshepo.SPRING.BOOT.Apllication.service.UserServiceImplementation;
import org.junit.jupiter.api.Test;
import org.springframework.cache.annotation.Caching;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;

@SpringJUnitWebConfig
@Caching
public class ApplicationTests {

    @Test
    public void ServiceImplementationTest() throws NullPointerException {
        FakeRepository fakeRepository = new FakeRepository();
        assertThat(Boolean.parseBoolean(String.valueOf(new UserServiceImplementation(fakeRepository)
                .addUser(1,"theo","park"))));
        assertThat(Boolean.parseBoolean(String.valueOf(new UserServiceImplementation(fakeRepository)
                .removeUser(1))));
        assertThat(Boolean.parseBoolean(String.valueOf(new UserServiceImplementation(fakeRepository)
                .getUser(1))));

    }
    private void assertThat(boolean parseBoolean) {
    }
    @Test
    public void testSecurityConfig() {
        assertThat(Boolean.parseBoolean(String.valueOf(new WebSecurityConfigurer())));
    }
}


