package com.demo.dish.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configuracion MVC donde se mapea ruta con vista
 * @author Victor Cruz
 *
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("home");
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/hello").setViewName("hello");
		registry.addViewController("/login").setViewName("login");
		registry.addViewController("/edit").setViewName("edit");
		registry.addViewController("/view").setViewName("view");
	}

}