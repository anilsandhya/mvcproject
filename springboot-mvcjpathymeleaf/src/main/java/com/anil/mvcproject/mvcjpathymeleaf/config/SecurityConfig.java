package com.anil.mvcproject.mvcjpathymeleaf.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	public void configure(final WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/h2-console/**");
	}
	
	@Override
	public void configure(final HttpSecurity http) throws Exception {
		// @formatter:off
		http.formLogin()
		        .defaultSuccessUrl("/students/")
		    .and()
		        .logout()
		        .permitAll()
		    .and()
		        .authorizeRequests()
		        .antMatchers("/**").hasRole("USER")
		;
		// @formatter:on
	}
}
