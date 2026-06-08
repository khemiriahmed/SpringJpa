package com.codewithahmed.springjpa;


import org.springframework.security.config.Customizer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//port org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;  
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class MysecurityConfig {
	 
	@Bean
	UserDetailsService  userDetailsService () {
	  InMemoryUserDetailsManager userDetailsService = new InMemoryUserDetailsManager();
	  UserDetails user = User.withUsername("ahmed").password(passwordEncoder().encode("1234")).authorities("read").build();
	  userDetailsService.createUser(user);
	  return userDetailsService;
	}
	
	@Bean
	 BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	 SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	    http
	        .formLogin(Customizer.withDefaults())
	        .authorizeHttpRequests(auth -> auth
	            .requestMatchers("/hi/**").permitAll()
	            .anyRequest().authenticated()
	        );
	    return http.build();
	}

}
