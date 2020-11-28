package com.finalProject.projectManagement.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests()
            .antMatchers(HttpMethod.GET, "/", "/index")
            .hasAnyAuthority("ROLE_ADMIN", "ROLE_USER")
            .anyRequest().permitAll()
            .and()
            .csrf().disable()
            .headers().frameOptions().disable()
            .and()
            .formLogin()
            .loginPage("/login")
            .usernameParameter("login")
            .passwordParameter("password")
            .loginProcessingUrl("/login-process")
            .defaultSuccessUrl("/index")
            .and()
            .logout()
            .logoutSuccessUrl("/login");
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()
                .withUser("user")
                .password("{noop}test").roles("USER");

    }
}
