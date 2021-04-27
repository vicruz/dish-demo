package com.demo.dish.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * Seguridad del proyecto
 * @author Victor Cruz
 *
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/", "/home","/public/all").permitAll()
				.antMatchers("/").permitAll()
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/login")
				.permitAll()
				.and()
			.logout()
				.permitAll();
	}

	/**
	 * Definicion de los usuarios y passwords
	 */
	@Bean
	@Override
	public UserDetailsService userDetailsService() {
		UserDetails user =
			 User.withDefaultPasswordEncoder()
				.username("user")
				.password("user")
				.roles("USER")
				.build();
		UserDetails admin =
				 User.withDefaultPasswordEncoder()
					.username("admin")
					.password("admin")
					.roles("ADMIN")
					.build();

		return new InMemoryUserDetailsManager(user, admin);
	}
	
	/**
	 * Configuracion de los enlaces publicos
	 */
	@Override
	public void configure(WebSecurity web) throws Exception {
		web
        .ignoring()
        .antMatchers("/resources/**", "/static/**", "/css/**","/webjars/**","/h2-console/**");
	}

}