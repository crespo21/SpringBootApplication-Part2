package com.tshepo.SPRING.BOOT.Apllication;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //enable in memory based authentication with a user named "creepy" and "lesley"
        auth.inMemoryAuthentication().withUser("creepy").password("password").roles("USER")
                .and().withUser("lesley").password("passYourWord").roles("USER", "ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/user")
                .authenticated()
                .antMatchers("/user")
                .permitAll()
                .and()
                .httpBasic();
    }
}


