package com.hisoka.practice2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class ProjectSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        http.csrf().disable().authorizeRequests()
                .mvcMatchers("/home").permitAll()
                .and().formLogin().loginPage("/login")
                .defaultSuccessUrl("/home").failureUrl("/login?error=true").permitAll()
                .and().httpBasic();
    }

    //In memory Authentication process below

    @Override
    protected void configure(AuthenticationManagerBuilder auth)throws Exception
    {
        auth.inMemoryAuthentication()
                .withUser("hisoka").password("123").roles("USER")
                .and().passwordEncoder(NoOpPasswordEncoder.getInstance());
    }
}
