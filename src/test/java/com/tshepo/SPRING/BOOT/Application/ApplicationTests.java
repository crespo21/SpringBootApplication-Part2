package com.tshepo.SPRING.BOOT.Application;

import com.tshepo.SPRING.BOOT.Apllication.Application;
import com.tshepo.SPRING.BOOT.Apllication.UserService;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import static org.hamcrest.Matchers.equalTo;

@SpringJUnitWebConfig
@Caching
@SpringBootTest(classes = Application.class)
public class ApplicationTests {

    @Autowired
    UserService userService;



    @Cacheable()
    @Test
    public void contextLoads() throws InterruptedException {
        Assert.assertEquals("Hello lesley venus",userService.getUser(1));
        Assert.assertEquals("Hello lesley venus",userService.getUser(2));
        Assert.assertEquals("Hello lesley venus",userService.getUser(3));
        Assert.assertEquals("Hello lesley venus",userService.getUser(4));

    }
    @Test
    public void setTestRestTemplate(){
        TestRestTemplate  testRestTemplate = new TestRestTemplate();
        ResponseEntity<String> response = testRestTemplate.
                getForEntity("http://localhost:8080" + "/login", String.class);

        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
    }

    private void assertThat(HttpStatus statusCode, Matcher<HttpStatus> equalTo) {
    }


}


