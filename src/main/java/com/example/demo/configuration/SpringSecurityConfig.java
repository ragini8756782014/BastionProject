package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.SecurityFilterChain;

import com.example.demo.service.UserInfoUserDetailService;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig {

	@Bean
	public UserDetailsService userDetailsService()
	{
//		UserDetails admin =User.withUsername("Basant")
//				.password(encoder.encode("Pwd1"))
//				.roles("ADMIN")
//				.build();
//		UserDetails user =User.withUsername("John")
//				.password(encoder.encode("Pwd2"))
//				.roles("USER")
//				.build();
//		return new InMemoryUserDetailsManager(admin,user);
		return new UserInfoUserDetailService();
	}
	
	@Bean
	public SecurityFilterChain securityFiletrChain(HttpSecurity http) throws Exception
	{
		DefaultSecurityFilterChain build = http.csrf().disable()
				.authorizeHttpRequests()
				.requestMatchers("/b/**").permitAll()
				.and()
				.authorizeHttpRequests().requestMatchers("/b/**")
				.authenticated().and().formLogin().and().build();
		return build;
				
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	public AuthenticationProvider authenticationProvidor()
	{
		DaoAuthenticationProvider authenticationProvider=new DaoAuthenticationProvider();
		authenticationProvider.setUserDetailsService(userDetailsService());
		authenticationProvider.setPasswordEncoder(passwordEncoder());
		return authenticationProvider;
	}
	
}
